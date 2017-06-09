package com.jiangzehui.kotlindemo

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import com.github.kittinunf.fuel.Fuel
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = "hellow kotlin!"
        tv.textSize = 20f
        tv.setTextColor(Color.GREEN)
        tv.setOnClickListener {
            //testFun(testIs(1))
            //testFor()
            //testWhile()
            var intent:Intent= Intent(this,Main2Activity::class.java)
            intent.putExtra("value","jzh")
            startActivity(intent)

        }
        getData()


    }

    /**
     * 函数
     */
    fun testFun(word: String) {
        Toast.makeText(this, word, Toast.LENGTH_SHORT).show()
    }

    fun testIs(word: Any): String {

        if (word is String) {//判断类型是否是String
            return word
        } else {
            return "no string"
        }

    }


    var item = listOf("item1", "item2", "item3")
    /**
     * for循环
     */
    fun testFor() {

//        for (index in item.indices) {//类似java的for循环
//            Toast.makeText(this, item[index], Toast.LENGTH_SHORT).show()
//        }

        for (index in  0..item.size-1) {//类似java的for循环
            Toast.makeText(this, item[index], Toast.LENGTH_SHORT).show()
        }


//        for (index in item) {//类似java的foreach
//            Toast.makeText(this, index, Toast.LENGTH_SHORT).show()
//        }
    }

    /**
     * while循环
     */
    fun testWhile(){
        var index = 0;
        while(index<item.size){
            Toast.makeText(this, item[index], Toast.LENGTH_SHORT).show()
            index++
        }

        var isbool = true
        while(isbool){
            isbool = false
            Toast.makeText(this, "isbool", Toast.LENGTH_SHORT).show()

        }




    }

    /**
     * 网络请求
     */
    fun getData(){
        Fuel.get("http://apicloud.mob.com/v1/weather/citys?key=1e501124818b4").responseString { request, response, result ->


            result.fold({ d ->
                var vm:CityModel = Gson().fromJson(d,CityModel::class.java)
                tv.text = vm.retCode+"---"+vm.msg+"\n"+ vm.result!![0].province
                //lv.adapter = MyAdapter2(this, vm.result!!)
                lv.adapter = MyAdapter3(this, vm.result as List<CityModel.ResultBean>)
            }, { err ->

            })
        }
    }


}

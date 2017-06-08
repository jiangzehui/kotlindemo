package com.jiangzehui.kotlindemo

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
            intent.putExtra("value","江泽辉")
            startActivity(intent)

        }

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

}

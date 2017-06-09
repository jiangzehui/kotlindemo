package com.jiangzehui.kotlindemo

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import com.github.kittinunf.fuel.Fuel
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var vm: CityModel? = null//城市列表集合
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lv.setOnItemClickListener { adapterView, view, i, l ->

            choiceCity(i)
        }
        getCity()


    }



    /**
     * 获取城市列表
     */
    fun getCity() {
        Fuel.get("http://apicloud.mob.com/v1/weather/citys?key=1e501124818b4").responseString { request, response, result ->
            result.fold({ d ->
                vm = Gson().fromJson(d, CityModel::class.java)
                lv.adapter = MyAdapter(this, vm?.result as List<CityModel.ResultBean>)
            }, { err ->
                Toast.makeText(this, "网络连接失败", Toast.LENGTH_SHORT).show()
            })
        }
    }

    /**
     * 选择某个城市
     */
    fun choiceCity(index:Int){
        var cityList = vm?.result?.get(index)?.city
        var province = vm?.result?.get(index)?.province
        var arr = Array<String>(cityList?.size!!, { i -> (i.toString()) })
        for (index in 0..cityList?.size!! - 1) {
            arr[index] = cityList?.get(index)?.city as String
        }
        AlertDialog.Builder(this).setTitle("选择城市").setItems(arr, DialogInterface.OnClickListener { dialogInterface, i ->
            var districtList = cityList?.get(i)?.district

            var arr = Array<String>(districtList?.size!!, { i -> (i.toString()) })
            for (index in 0..districtList?.size!! - 1) {
                arr[index] = districtList?.get(index)?.district as String
            }
            AlertDialog.Builder(this).setTitle("选择城市").setItems(arr, DialogInterface.OnClickListener { dialogInterface, i ->
                var districtList = districtList?.get(i)?.district
                var intent: Intent = Intent(this, Main2Activity::class.java)
                intent.putExtra("province", province)
                intent.putExtra("city", districtList)
                startActivity(intent)
            }).show()
        }).show()
    }


}

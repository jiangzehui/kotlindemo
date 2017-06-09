package com.jiangzehui.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.kittinunf.fuel.Fuel
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    var province = ""
    var city = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        province = intent.getStringExtra("province")
        city = intent.getStringExtra("city")
        tv.text = province + "----" + city
        getWeather()
    }


    /**
     * 网络请求
     */
    fun getWeather() {
        Fuel.get("http://apicloud.mob.com/v1/weather/query?key=1e501124818b4&province=" + province + "&city=" + city).responseString { request, response, result ->


            result.fold({ d ->
                var vm = Gson().fromJson(d, WeatherModel::class.java)
                tv.text = "今日天气情况：\n" + vm?.result?.get(0)?.city + "-" + vm?.result?.get(0)?.distrct + "\n" + vm?.result?.get(0)?.date + "\n当前温度：" + vm?.result?.get(0)?.temperature + "\n" + vm?.result?.get(0)?.weather + "\n" + vm?.result?.get(0)?.wind + "\n" + vm?.result?.get(0)?.humidity + "\n数据更新时间：" + vm?.result?.get(0)?.date + " " + vm?.result?.get(0)?.time
                lv.adapter = MyAdapter(this, vm?.result?.get(0)?.future as List<WeatherModel.ResultBean.FutureBean>)
            }, { err ->

            })
        }
    }
}

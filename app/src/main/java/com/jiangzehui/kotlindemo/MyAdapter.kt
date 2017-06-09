package com.jiangzehui.kotlindemo

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

import java.util.ArrayList

/**
 * Created by jiangzehui on 17/6/8.
 */
class MyAdapter(var context:Context, var list: List<CityModel.ResultBean>) : BaseAdapter() {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(i: Int): Any {
        return list[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup?): View {

        val tv = TextView(context)
        tv.text = list[i].province
        return tv
    }
}

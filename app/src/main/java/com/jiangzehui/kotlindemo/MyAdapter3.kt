package com.jiangzehui.kotlindemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

/**
 * Created by jiangzehui on 17/6/9.
 */
class MyAdapter3(internal var context:Context, internal var list: List<CityModel.ResultBean>) : BaseAdapter() {

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
        var holder: Holder
        var rootView : View
        if (view == null) {
            rootView = LayoutInflater.from(context).inflate(R.layout.item, viewGroup, false)
            holder = Holder(rootView)
            rootView.tag = holder
        }else{
            rootView = view
            holder = rootView.tag as Holder
        }
        holder.name.text = list[i].province



        return rootView



    }

    class Holder(var itemView:View){
        val name:TextView = itemView.findViewById(R.id.tv) as TextView
    }
}

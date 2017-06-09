package com.jiangzehui.kotlindemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jiangzehui on 17/6/9.
 */
public class MyAdapter2 extends BaseAdapter {


    Context context;
    List<CityModel.ResultBean> list;

    public MyAdapter2(Context context, List<CityModel.ResultBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView tv = new TextView(context);
        tv.setText(list.get(i).getProvince());
        tv.setPadding(20,20,20,20);
        tv.setTextSize(20);
        return tv;
    }
}

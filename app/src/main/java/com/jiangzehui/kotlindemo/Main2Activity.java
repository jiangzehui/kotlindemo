package com.jiangzehui.kotlindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String value = getIntent().getStringExtra("value");
        Toast.makeText(this,value,Toast.LENGTH_SHORT).show();
    }
}

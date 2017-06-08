package com.jiangzehui.kotlindemo

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
            printWord(returnWord("returnword"))

        }

    }

    /**
     * 函数
     */
    fun printWord(word: String) {
        Toast.makeText(this, word, Toast.LENGTH_SHORT).show()
    }

    fun returnWord(word: Any): String {

        if(word is String){//判断类型是否是String
            return word
        }else{
            return "no string"
        }

    }

    /**
     * 循环
     */
    fun printFor(){
        var item = listOf("item1","item2","item3")

    }

}

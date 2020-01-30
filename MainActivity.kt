package com.t3h.practice_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var arraylienquan : ArrayList<LienQuan> = ArrayList()
        arraylienquan.add(LienQuan("butterfly", R.drawable.buffterfly))
        arraylienquan.add(LienQuan("yorn", R.drawable.yorn))
        arraylienquan.add(LienQuan("airi", R.drawable.airi))
        arraylienquan.add(LienQuan("quilen", R.drawable.quilen))
        arraylienquan.add(LienQuan("krixi", R.drawable.krixi))
        listview.adapter = CustomAdapter(this,arraylienquan )
    }
}

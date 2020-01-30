package com.t3h.practice_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter constructor(var context: Context, var listboss: ArrayList<LienQuan>): BaseAdapter() {
    class ViewHoder(row: View){
        var imageview : ImageView
        var textview : TextView
        init {
            textview = row.findViewById(R.id.textview)
            imageview = row.findViewById(R.id.imageview)
        }
    }
    override fun getView(position: Int, converview: View?, p2: ViewGroup?): View {
        var view : View?
        var viewhoder : ViewHoder
        if(converview == null){
            var layoutinflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutinflater.inflate(R.layout.boss, null)
            viewhoder = ViewHoder(view)
            view.tag = viewhoder
        }
        else{
            view = converview
            viewhoder = converview.tag as ViewHoder
        }
        var lienquan : LienQuan = getItem(position) as LienQuan
        viewhoder.textview.text = lienquan.name
        viewhoder.imageview.setImageResource(lienquan.image)

        return view as View
    }

    override fun getItem(postion: Int): Any {
        return listboss.get(postion)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return listboss.size
    }
}
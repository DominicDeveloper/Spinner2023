package com.asadbek.spinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.core.content.ContextCompat

class MyAdapter(var context: Context,var list: ArrayList<String>):BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(p0: Int): Any {
       return  list[p0]
    }

    override fun getItemId(p0: Int): Long {
       return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
       var itemView:View
       if (p1 == null){
           itemView = LayoutInflater.from(p2?.context).inflate(R.layout.item,p2,false)

       }else{
           itemView = p1
       }

        itemView.findViewById<TextView>(R.id.itemText).text = list[p0]
        var color = list[p0]
        itemView.setOnClickListener {
          when(color){
              "white" -> {
                  Color.color = "white"
                  var view = LayoutInflater.from(context).inflate(R.layout.activity_main,null,false)
                  view.setBackgroundColor(ContextCompat.getColor(context,R.color.white))
              }
              "black" -> {
                  Color.color = "black"
                  var view = LayoutInflater.from(context).inflate(R.layout.activity_main,null,false)
                  view.setBackgroundColor(ContextCompat.getColor(context,R.color.black))
              }
              "red" -> {
                  Color.color = "red"
                  var view = LayoutInflater.from(context).inflate(R.layout.activity_main,null,false)
                  view.setBackgroundColor(ContextCompat.getColor(context,R.color.red))
              }
              "green" -> {
                  Color.color = "green"
                  var view = LayoutInflater.from(context).inflate(R.layout.activity_main,null,false)
                  view.setBackgroundColor(ContextCompat.getColor(context,R.color.green))
              }
              "blue" -> {
                  Color.color = "blue"
                  var view = LayoutInflater.from(context).inflate(R.layout.activity_main,null,false)
                  view.setBackgroundColor(ContextCompat.getColor(context,R.color.blue))
              }
              "light blue" -> {
                  Color.color = "light blue"
                  var view = LayoutInflater.from(context).inflate(R.layout.activity_main,null,false)
                  view.setBackgroundColor(ContextCompat.getColor(context,R.color.cloud))
              }
          }
        }

      return itemView
    }

}

package com.asadbek.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asadbek.spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    lateinit var list:ArrayList<String>
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = ArrayList()
        list.add("red")
        list.add("white")
        list.add("black")
        list.add("green")
        list.add("blue")
        list.add("light blue")

        myAdapter = MyAdapter(this,list)
        binding.spinner.adapter = myAdapter

    }
}
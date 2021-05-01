package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var adapter:ListAdapter = ListAdapter(this)
    var models:MutableList<User> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

    }
    fun setData(size:Int,Count:Int){
        var model:User = User()
        for(i in size until size+Count){
            model.Name = "User name ${i+1}"
            model.LastName = "User lastname ${i+1}"
            models.add(model)
        }
        adapter.models = models
    }
}
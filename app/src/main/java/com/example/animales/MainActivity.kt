package com.example.animales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.animales.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var recyclerView: RecyclerView

    private var isLinearLayoutManager = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerView
        // Sets the LinearLayoutManager of the recyclerview


        recyclerView.layoutManager = GridLayoutManager(this, 4)

        recyclerView.adapter = TipoAdapter(this)
    }
}
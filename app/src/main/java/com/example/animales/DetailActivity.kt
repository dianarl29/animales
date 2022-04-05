package com.example.animales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.animales.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    companion object{
        const val TIPO ="tipo"
        const val SEARCH_PREFIX = "https://www.google.com/search?q="
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var tipoId = intent?.extras?.getString(TIPO).toString().uppercase()

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=AnimalAdapter(tipoId,this)

        title= "Animales cuyo tipo es" + ""+ tipoId
    }
}
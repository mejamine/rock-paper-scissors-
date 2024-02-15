package com.example.mygame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mygame.databinding.ActivityPlayer2Binding

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val binding=ActivityPlayer2Binding.inflate(layoutInflater)


    }
}
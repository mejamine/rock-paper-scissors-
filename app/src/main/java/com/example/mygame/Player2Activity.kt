package com.example.mygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mygame.databinding.ActivityPlayer2Binding

class Player2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player2)
        val binding = ActivityPlayer2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var player1=intent.getStringExtra("choice_player1")
        binding.button5.setOnClickListener {
            var i = Intent(this, Final::class.java)
            i.putExtra("choice_player2", "ROCK")
            i.putExtra("choice_player1", player1.toString())
            startActivity(i)
        }
        binding.button6.setOnClickListener {
            var i = Intent(this, Final::class.java)
            i.putExtra("choice_player2", "PAPER")
            i.putExtra("choice_player1", player1.toString())
            startActivity(i)
        }
        binding.button7.setOnClickListener {
            var i = Intent(this, Final::class.java)
            i.putExtra("choice_player2", "SEASERS")
            i.putExtra("choice_player1", player1.toString())
            startActivity(i)
        }
    }
}
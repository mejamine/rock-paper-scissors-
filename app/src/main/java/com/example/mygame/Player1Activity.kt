package com.example.mygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mygame.databinding.ActivityPlayer1Binding

class Player1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player1)
        val binding = ActivityPlayer1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            var i = Intent(this, Player2Activity::class.java)
            i.putExtra("choice_player1", "ROCK")
            startActivity(i)
        }
        binding.button3.setOnClickListener {
            var i = Intent(this, Player2Activity::class.java)
            i.putExtra("choice_player1", "PAPER")
            startActivity(i)
        }
        binding.button4.setOnClickListener {
            var i = Intent(this, Player2Activity::class.java)
            i.putExtra("choice_player1", "SEASERS")
            startActivity(i)
        }

    }
}
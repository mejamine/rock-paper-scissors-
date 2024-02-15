package com.example.mygame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mygame.databinding.ActivityFinalBinding

class Final : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        val binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var player1=intent.getStringExtra("choice_player1")
        var player2=intent.getStringExtra("choice_player2")
        if(player1==player2){
            binding.textView3.text="It's a tie"
        }
        if((player1=="ROCK" && player2=="SEASERS")||(player1=="SEASERS" && player2=="PAPER")||(player1=="PAPER" && player2=="ROCK")){
            binding.textView3.text="Player1 is the winner"
        }
        if((player2=="ROCK" && player1=="SEASERS")||(player2=="SEASERS" && player1=="PAPER")||(player2=="PAPER" && player1=="ROCK")){
            binding.textView3.text="Player2 is the winner"
        }

        binding.button8.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}
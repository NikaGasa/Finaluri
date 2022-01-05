package com.example.hangman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var playbutton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        playbutton()

    }
    private fun init(){
         playbutton = findViewById(R.id.playbutton)
    }
    private fun playbutton(){
        playbutton.setOnClickListener{

        }
    }


}
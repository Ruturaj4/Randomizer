package com.ruturaj.android.randomizer

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        resultsTextView.text = "0"
        seekBar.progress = 5
        seekBar.min = 1
        seekBar.max = 100

        rollButton.setOnClickListener{
            val rand = Random().nextInt(seekBar.progress)
            resultsTextView.text = rand.toString()
        }
    }
}

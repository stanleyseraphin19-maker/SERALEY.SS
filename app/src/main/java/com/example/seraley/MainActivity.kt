package com.example.seraley

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.question).setOnClickListener {
            findViewById<View>(R.id.question).visibility= View.INVISIBLE
            findViewById<View>(R.id.answer).visibility= View.VISIBLE
        }
        findViewById<View>(R.id.answer).setOnClickListener {
            findViewById<View>(R.id.question).visibility= View.VISIBLE
            findViewById<View>(R.id.answer).visibility= View.INVISIBLE
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
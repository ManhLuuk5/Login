package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Ac_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac2)

        val i2 = intent
        val name2 = i2.getStringExtra("name")
        val age2 = i2.getIntExtra("age", 0)
        val nameTextView = findViewById<TextView>(R.id.n1)
        val ageTextView = findViewById<TextView>(R.id.a1)
        nameTextView.text = name2
        ageTextView.text = age2.toString()


    }
}
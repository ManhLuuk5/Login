package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bTn = findViewById<TextView>(R.id.bTn)
        bTn.setOnClickListener {
            val i = Intent(this, Ac_2::class.java)
            i.putExtra("name", "John")
            i.putExtra("age", 22)
            i.putExtra("bienBool", true)
            startActivity(i)
        }
    }
}
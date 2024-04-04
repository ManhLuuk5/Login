package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
            binding?.bTn?.setOnClickListener {
                Intent(this, MainActivity2::class.java).apply {
                    putExtra("name", "John")
                    putExtra("age", 22)
                    putExtra("bienBool", true)
                    startActivity(this)
                }
            }
        }
    }
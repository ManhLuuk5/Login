package com.example.myapplication

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityAc2Binding


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding :ActivityAc2Binding = DataBindingUtil.setContentView(this,com.example.myapplication.R.layout.activity_ac2)
        val name = intent.getStringExtra("name")
        val age = intent.getIntExtra("age", 0)
        binding.apply {
            nameTextView.text = name
            ageTextView.text = age.toString()
            bTn2.setOnClickListener() {
                finish()
            }
        }
    }
}
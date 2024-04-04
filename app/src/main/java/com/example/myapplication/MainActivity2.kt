package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityAc2Binding

class MainActivity2 : AppCompatActivity() {
    private var binding: ActivityAc2Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_ac2)

        val name = intent.getStringExtra("name")
        val age = intent.getIntExtra("age", 0)
        binding?.apply {
            nameTextView.text = name
            ageTextView.text = age.toString()
            bTn2.setOnClickListener() {
                finish()
            }
        }
    }
}
package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    private  var binding: ActivityMainBinding? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        binding?.bTn?.setOnClickListener {
            val i = Intent(this@MainActivity, Ac_2::class.java)
            i.putExtra("name", "John")
            i.putExtra("age", 22)
            i.putExtra("bienBool", true)
            startActivity(i)

        }
    }
}
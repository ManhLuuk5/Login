package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityAc2Binding

class Ac_2 : AppCompatActivity() {
    private  var binding: ActivityAc2Binding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding?.b1!!.setOnClickListener(){
           // onBack()
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_ac2)
        val i2 = intent
        val name2 = i2.getStringExtra("name")
        val age2 = i2.getIntExtra("age", 0)
        binding.apply {
            this?.n1?.text = name2
            this?.a1?.text = age2.toString()
        }
    }

}
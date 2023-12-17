package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_e2023.*
import kotlinx.android.synthetic.main.activity_f2023.*

class F2023 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f2023)
        openF1.setOnClickListener {
            val intent= Intent(applicationContext,F2023Paper::class.java)
            intent.putExtra("key","F1")
            startActivity(intent)
        }
        openF2.setOnClickListener {
            val intent= Intent(applicationContext,F2023Paper::class.java)
            intent.putExtra("key","F2")
            startActivity(intent)
        }
        openF3.setOnClickListener {
            val intent= Intent(applicationContext,F2023Paper::class.java)
            intent.putExtra("key","F3")
            startActivity(intent)
        }
        openF4.setOnClickListener {
            val intent= Intent(applicationContext,F2023Paper::class.java)
            intent.putExtra("key","F4")
            startActivity(intent)
        }
        openF5.setOnClickListener {
            val intent= Intent(applicationContext,F2023Paper::class.java)
            intent.putExtra("key","F5")
            startActivity(intent)
        }
        openF6.setOnClickListener {
            val intent= Intent(applicationContext,F2023Paper::class.java)
            intent.putExtra("key","F6")
            startActivity(intent)
        }

    }
}
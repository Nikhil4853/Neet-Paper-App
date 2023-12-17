package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_e2023.*

class E2023 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e2023)
        openE1.setOnClickListener {
            val intent=Intent(applicationContext,E2023Paper::class.java)
            intent.putExtra("key","E1")
            startActivity(intent)
        }
         openE2.setOnClickListener {
            val intent=Intent(applicationContext,E2023Paper::class.java)
            intent.putExtra("key","E2")
            startActivity(intent)
        }
         openE3.setOnClickListener {
            val intent=Intent(applicationContext,E2023Paper::class.java)
            intent.putExtra("key","E3")
            startActivity(intent)
        }
         openE4.setOnClickListener {
            val intent=Intent(applicationContext,E2023Paper::class.java)
            intent.putExtra("key","E4")
            startActivity(intent)
        }
        openE5.setOnClickListener {
            val intent=Intent(applicationContext,E2023Paper::class.java)
            intent.putExtra("key","E5")
            startActivity(intent)
        }
        openE6.setOnClickListener {
            val intent=Intent(applicationContext,E2023Paper::class.java)
            intent.putExtra("key","E6")
            startActivity(intent)
        }

    }
}
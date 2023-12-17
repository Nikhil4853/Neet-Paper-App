package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_g2023.*
import kotlinx.android.synthetic.main.activity_h2023.*

class H2023 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h2023)

        openH1.setOnClickListener {
            val intent= Intent(applicationContext,H2023Paper::class.java)
            intent.putExtra("key","H1")
            startActivity(intent)
        }
        openH2.setOnClickListener {
            val intent= Intent(applicationContext,H2023Paper::class.java)
            intent.putExtra("key","H2")
            startActivity(intent)
        }
        openH3.setOnClickListener {
            val intent= Intent(applicationContext,H2023Paper::class.java)
            intent.putExtra("key","H3")
            startActivity(intent)
        }
        openH4.setOnClickListener {
            val intent= Intent(applicationContext,H2023Paper::class.java)
            intent.putExtra("key","H4")
            startActivity(intent)
        }
        openH5.setOnClickListener {
            val intent= Intent(applicationContext,H2023Paper::class.java)
            intent.putExtra("key","G5")
            startActivity(intent)
        }
        openH6.setOnClickListener {
            val intent= Intent(applicationContext,H2023Paper::class.java)
            intent.putExtra("key","H6")
            startActivity(intent)
        }

    }
}
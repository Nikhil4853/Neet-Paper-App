package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_f2023.*
import kotlinx.android.synthetic.main.activity_f2023.openF4
import kotlinx.android.synthetic.main.activity_f2023.openF5
import kotlinx.android.synthetic.main.activity_g2023.*

class G2023 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g2023)

        openG1.setOnClickListener {
            val intent= Intent(applicationContext,G2023Paper::class.java)
            intent.putExtra("key","G1")
            startActivity(intent)
        }
        openG2.setOnClickListener {
            val intent= Intent(applicationContext,G2023Paper::class.java)
            intent.putExtra("key","G2")
            startActivity(intent)
        }
        openG3.setOnClickListener {
            val intent= Intent(applicationContext,G2023Paper::class.java)
            intent.putExtra("key","G3")
            startActivity(intent)
        }
        openG4.setOnClickListener {
            val intent= Intent(applicationContext,G2023Paper::class.java)
            intent.putExtra("key","G4")
            startActivity(intent)
        }
        openG5.setOnClickListener {
            val intent= Intent(applicationContext,G2023Paper::class.java)
            intent.putExtra("key","G5")
            startActivity(intent)
        }
        openG6.setOnClickListener {
            val intent= Intent(applicationContext,G2023Paper::class.java)
            intent.putExtra("key","G6")
            startActivity(intent)
        }

    }
}
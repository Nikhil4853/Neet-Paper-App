package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_paper2023.*

class Paper2023 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper2023)
        openE.setOnClickListener {
            val intent= Intent(this,E2023::class.java)
            startActivity(intent)
            Toast.makeText(this,"Opening",Toast.LENGTH_LONG).show()
        }
        openF.setOnClickListener {
            val intent= Intent(this,F2023::class.java)
            startActivity(intent)
            Toast.makeText(this,"Opening",Toast.LENGTH_LONG).show()
        }
        openG.setOnClickListener {
            val intent= Intent(this,G2023::class.java)
            startActivity(intent)
            Toast.makeText(this,"Opening",Toast.LENGTH_LONG).show()
        }
        openH.setOnClickListener {
            val intent= Intent(this,H2023::class.java)
            startActivity(intent)
            Toast.makeText(this,"Opening",Toast.LENGTH_LONG).show()
        }
    }
}
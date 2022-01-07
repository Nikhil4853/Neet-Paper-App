package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_paper2016.*

class Paper2016 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper2016)
        // paper and ans

        ansSet1y2016.setOnClickListener {

            val as1y2016=Intent(this,ANSSET1Y2016::class.java)
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            startActivity(as1y2016)
        }
    }
}
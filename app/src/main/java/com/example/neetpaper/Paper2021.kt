package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_paper2021.*

class Paper2021 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper2021)
        openSet1y2021.setOnClickListener {
            val intent = Intent(this, Paper::class.java)
            intent.putExtra("key","set1y2021")
            startActivity(intent)
            Toast.makeText(this, "Opening", Toast.LENGTH_SHORT).show()
        }
        openSet2y2021.setOnClickListener {
            val intent = Intent(this, Paper::class.java)
            intent.putExtra("key","set2y2021")
            startActivity(intent)
            Toast.makeText(this, "Opening", Toast.LENGTH_SHORT).show()
        }
        openSet3y2021.setOnClickListener {
            val intent = Intent(this, Paper::class.java)
            intent.putExtra("key","set3y2021")
            startActivity(intent)
            Toast.makeText(this, "Opening", Toast.LENGTH_SHORT).show()
        }
        openSet4y2021.setOnClickListener {
            val intent = Intent(this, Paper::class.java)
            intent.putExtra("key","set4y2021")
            startActivity(intent)
            Toast.makeText(this, "Opening", Toast.LENGTH_SHORT).show()
        }

        ansSet1y2021.setOnClickListener {
            comming()
        }
        ansSet2y2021.setOnClickListener {
            comming()
        }
        ansSet3y2021.setOnClickListener {
            comming()
        }
        ansSet4y2021.setOnClickListener {
            comming()
        }


    }

    private fun comming() {
      Toast.makeText(this,"Coming soon",Toast.LENGTH_LONG).show()
    }
}
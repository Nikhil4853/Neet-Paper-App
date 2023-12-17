package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn2023.setOnClickListener {
val intent=Intent(this,Paper2023::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext,"Opening",Toast.LENGTH_LONG ).show()
        }
        btn2022.setOnClickListener {

        }
        btn2021.setOnClickListener{
            val intent=Intent(this, Paper2021::class.java)
            Toast.makeText(applicationContext,"Opening",Toast.LENGTH_LONG).show()
            startActivity(intent)

        }

        btn2020.setOnClickListener{
            val intent = Intent(this, Paper2020::class.java)
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_LONG).show()
            startActivity(intent)
        }

        btn2019.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val paper2019 = Intent(this,Paper2019::class.java)
            startActivity(paper2019)
        }
        btn2018.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val paper2018=Intent(this,Paper2018::class.java)
            startActivity(paper2018)
        }
        btn2017.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val paper2017= Intent(this,Paper2017::class.java)
            startActivity(paper2017)
        }
        btn2016.setOnClickListener {
            Toast.makeText(applicationContext, "", Toast.LENGTH_SHORT).show()
            val paper2016=Intent(this,Paper2016::class.java)
            startActivity(paper2016)
        }
    }
}
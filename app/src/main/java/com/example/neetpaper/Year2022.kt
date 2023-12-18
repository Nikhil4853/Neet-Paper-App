package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_year2022.*

class Year2022 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_year2022)
        openSet1y2022.setOnClickListener {
            val intent=Intent(this,Paper2022::class.java)
            intent.putExtra("key","set1")
            startActivity(intent)
        }
        openSet2y2022.setOnClickListener {
            val intent=Intent(this,Paper2022::class.java)
            intent.putExtra("key","set2")
            startActivity(intent)
        }
        openSet3y2022.setOnClickListener {
            val intent=Intent(this,Paper2022::class.java)
            intent.putExtra("key","set3")
            startActivity(intent) }

        openSet4y2022.setOnClickListener {
            val intent=Intent(this,Paper2022::class.java)
            intent.putExtra("key","set4")
            startActivity(intent) }

        openSet5y2022.setOnClickListener {
            val intent=Intent(this,Paper2022::class.java)
            intent.putExtra("key","set5")
            startActivity(intent) }

        openSet6y2022.setOnClickListener {
            val intent=Intent(this,Paper2022::class.java)
            intent.putExtra("key","set6")
            startActivity(intent) }

        openSet7y2022.setOnClickListener {
            val intent=Intent(this,Paper2022::class.java)
            intent.putExtra("key","set7")
            startActivity(intent) }

        openSet8y2022.setOnClickListener {
            val intent=Intent(this,Paper2022::class.java)
            intent.putExtra("key","set8")
            startActivity(intent) }


        ansSet1y2022.setOnClickListener { Toast.makeText(this,"Coming soon",Toast.LENGTH_LONG).show() }
        ansSet2y2022.setOnClickListener { Toast.makeText(this,"Coming soon",Toast.LENGTH_LONG).show() }
        ansSet3y2022.setOnClickListener { Toast.makeText(this,"Coming soon",Toast.LENGTH_LONG).show() }
        ansSet4y2022.setOnClickListener { Toast.makeText(this,"Coming soon",Toast.LENGTH_LONG).show() }
        ansSet5y2022.setOnClickListener { Toast.makeText(this,"Coming soon",Toast.LENGTH_LONG).show() }
        ansSet6y2022.setOnClickListener { Toast.makeText(this,"Coming soon",Toast.LENGTH_LONG).show() }
        ansSet7y2022.setOnClickListener { Toast.makeText(this,"Coming soon",Toast.LENGTH_LONG).show() }
        ansSet8y2022.setOnClickListener { Toast.makeText(this,"Coming soon",Toast.LENGTH_LONG).show() }
    }
}
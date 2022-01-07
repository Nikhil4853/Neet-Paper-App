package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_paper2019.*

class Paper2019 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper2019)

        // paper set 1 and ans
        Set1y2019.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
val ps1y2019= Intent(this,PaperSet1Y2019::class.java)
            startActivity(ps1y2019)
        }

        // paper set 2 and ans
        Set2y2019.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
val ps2y2019 = Intent(this,PaperSet2y2019::class.java)
            startActivity(ps2y2019)
        }

        //paper set 2 and ans
        btnSet3y2019.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
val ps3y2019=Intent(this,PaperSet3y2019::class.java)
            startActivity(ps3y2019)
        }
    }

}
package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_paper2018.*

class Paper2018 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper2018)
        
        // paper and ans
        paperSet1y2018.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val ps1y2018=Intent(this,PaperSet12018::class.java)
            startActivity(ps1y2018)
        }
        ansSet1y2018.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
val as1y2018= Intent(this,ANSSET1Y2018::class.java)
            startActivity(as1y2018)
        }
    }
}
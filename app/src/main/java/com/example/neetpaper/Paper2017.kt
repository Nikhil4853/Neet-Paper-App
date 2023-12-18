package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_paper2017.*

class Paper2017 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper2017)

        // paper set1 and ans
        paperSet1y2017.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val ps1y2017 = Intent(this, PaperSet1y2017::class.java)
            startActivity(ps1y2017)
        }
        ansSet1y2017.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val as1y2017 = Intent(this, ANSSET1Y2017::class.java)
            startActivity(as1y2017)
        }
        // paper set2 and ans
        paperSet2y2017.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val ps2y2017= Intent(this,PaperSet2y2017::class.java)
            startActivity(ps2y2017)
        }
        ansSet2y2017.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val as2y2017=Intent(this,ANSSET2Y2017::class.java)
            startActivity(as2y2017)
        }

        //paper set3 and ans
        paperSet3y2017.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
val ps3y2017=Intent(this,PaperSet3y2017::class.java)
            startActivity(ps3y2017)
        }
        ansSet3y2017.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val as3y2017=Intent(this,ANSSET3Y2017::class.java)
            startActivity(as3y2017)
        }

        // paper set4 and ans
        paperSet4y2017.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val ps4y2017=Intent(this,PaperSet4y2017::class.java)
            startActivity(ps4y2017)
        }
        ansSet4y2017.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val as4y2017=Intent(this,ANSSET4Y2017::class.java)
            startActivity(as4y2017)
        }
    }
}
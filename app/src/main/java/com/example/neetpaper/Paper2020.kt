package com.example.neetpaper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_paper2020.*

class Paper2020 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper2020)


// PaperSet1Year2020 and ans
        Set1y2020.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val PS1Y2020 = Intent(this,PaperSet1::class.java)
            startActivity(PS1Y2020)
        }
        AnsSet1y2020.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val AS1Y2020 = Intent(this,ANSSET12020::class.java)
            startActivity(AS1Y2020)
        }




        //PaperSet2Year2020 and ans
        openSet2y2020.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val PS2Y2020 = Intent(this,PaperSet2Y2020::class.java)
            startActivity(PS2Y2020)

        }
        ansSet1y2020.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val Anss2y2020 = Intent(this,ANSSET2Y2020::class.java)
            startActivity(Anss2y2020)
        }


        // PaperSet3y2020 and ans
        openSet3y2020.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
         val pset3y2020 = Intent(this,PS3Y2020::class.java)
            startActivity(pset3y2020)
        }
        ansSet3y2020.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
val as3y2020 = Intent(this, ANSSET3Y2020::class.java)
            startActivity(as3y2020)
        }

        // PaperSet4y2020 and ans

        openSet4y2020.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val ps4y2020 = Intent(this,PS4Y2020::class.java)
            startActivity(ps4y2020)
        }
        ansSet4y2020.setOnClickListener {
            Toast.makeText(applicationContext, "Opening", Toast.LENGTH_SHORT).show()
            val as4y2020 = Intent(this, ANSSET4Y2020::class.java)
            startActivity(as4y2020)
        }
    }
}
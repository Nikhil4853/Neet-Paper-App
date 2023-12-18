package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_f2023_paper.*
import kotlinx.android.synthetic.main.activity_g2023_paper.*

class G2023Paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_g2023_paper)
        var text=intent.getStringExtra("key")
        if(text=="G1"){
            G20223Paper.fromAsset("g1y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="G2"){
            G20223Paper.fromAsset("g2y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="G3"){
            G20223Paper.fromAsset("g3y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="G4"){
            G20223Paper.fromAsset("g4y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="G5"){
            G20223Paper.fromAsset("g5y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="G6"){
            G20223Paper.fromAsset("g6y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }

    }
}
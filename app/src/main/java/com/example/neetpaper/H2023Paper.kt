package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_g2023_paper.*
import kotlinx.android.synthetic.main.activity_h2023_paper.*

class H2023Paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h2023_paper)
        var text=intent.getStringExtra("key")
        if(text=="H1"){
            H20223Paper.fromAsset("h1y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="H2"){
            H20223Paper.fromAsset("h2y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="H3"){
            H20223Paper.fromAsset("h3y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="H4"){
            H20223Paper.fromAsset("h4y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="H5"){
            G20223Paper.fromAsset("h5y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="H6"){
            H20223Paper.fromAsset("h6y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }

    }
}
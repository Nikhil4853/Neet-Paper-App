package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_e2023_paper.*
import kotlinx.android.synthetic.main.activity_f2023_paper.*

class F2023Paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f2023_paper)
        var text=intent.getStringExtra("key")
        if(text=="F1"){
            F20223Paper.fromAsset("f1y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="F2"){
            F20223Paper.fromAsset("f2y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="F3"){
            F20223Paper.fromAsset("f3y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="F4"){
            F20223Paper.fromAsset("f4y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="F5"){
            F20223Paper.fromAsset("f5y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }
        if(text=="F6"){
            F20223Paper.fromAsset("f6y2023.pdf").load()
            Toast.makeText(this ,"Open", Toast.LENGTH_LONG).show()
        }

    }
}
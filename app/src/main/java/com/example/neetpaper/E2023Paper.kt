package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_e2023_paper.*

class E2023Paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e2023_paper)
        var text=intent.getStringExtra("key")
        if(text=="E1"){
            E20223Paper.fromAsset("e1y2023.pdf").load()
            Toast.makeText(this ,"Open",Toast.LENGTH_LONG).show()
        }
         if(text=="E2"){
             E20223Paper.fromAsset("e2y2023.pdf").load()
             Toast.makeText(this ,"Open",Toast.LENGTH_LONG).show()
        }
         if(text=="E3"){
             E20223Paper.fromAsset("e3y2023.pdf").load()
             Toast.makeText(this ,"Open",Toast.LENGTH_LONG).show()
        }
         if(text=="E4"){
             E20223Paper.fromAsset("e4y2023.pdf").load()
             Toast.makeText(this ,"Open",Toast.LENGTH_LONG).show()
        }
         if(text=="E5"){
             E20223Paper.fromAsset("e5y2023.pdf").load()
             Toast.makeText(this ,"Open",Toast.LENGTH_LONG).show()
        }
         if(text=="E6"){
             E20223Paper.fromAsset("e6y2023.pdf").load()
             Toast.makeText(this ,"Open",Toast.LENGTH_LONG).show()
        }

    }
}
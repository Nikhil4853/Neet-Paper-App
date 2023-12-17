package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.neetpaper.Paper
import kotlinx.android.synthetic.main.activity_paper.*

class Paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper)
        val text=intent.getStringExtra("key")
        if(text=="set1"){
            Paper.fromAsset("Set1y2021.pdf").load()

        }else if(text=="set2"){
            Paper.fromAsset("Set2y2021.pdf").load()
        }else if(text=="set3"){
            Paper.fromAsset("Set3y2021.pdf").load()
        }else if(text=="set4"){
            Paper.fromAsset("Set4y2021.pdf").load()
        }
    }
}

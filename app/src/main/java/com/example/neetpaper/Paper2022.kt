package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_paper2022.*

class Paper2022 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper2022)
        var text=intent.getStringExtra("key")
        if(text=="set1"){
            paper2022.fromAsset("set1y2022.pdf").load()
        }else if(text=="set2"){
            paper2022.fromAsset("set2y2022.pdf").load()
        }else if(text=="set3"){
            paper2022.fromAsset("set3y2022.pdf").load()
        }else if(text=="set4"){
            paper2022.fromAsset("set4y2022.pdf").load()
        }else if(text=="set5"){
            paper2022.fromAsset("set5y2022.pdf").load()
        }else if(text=="set6"){
            paper2022.fromAsset("set6y2022.pdf").load()
        }else if(text=="set7"){
            paper2022.fromAsset("set7y2022.pdf").load()
        }else if(text=="set8"){
            paper2022.fromAsset("set8y2022.pdf").load()
        }

    }
}
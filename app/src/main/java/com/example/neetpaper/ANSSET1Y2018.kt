package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ansset1_y2018.*

class ANSSET1Y2018 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ansset1_y2018)
        AS1Y2018.fromAsset("Set1y2018Ans.pdf").load()
    }
}
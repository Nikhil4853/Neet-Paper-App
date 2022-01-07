package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ansset1_y2016.*

class ANSSET1Y2016 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ansset1_y2016)
        AS1Y2016.fromAsset("Set1y2016Ans.pdf").load()
    }
}
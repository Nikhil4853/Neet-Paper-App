package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ansset2_y2017.*

class ANSSET2Y2017 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ansset2_y2017)
        AS2Y2017.fromAsset("Set2y2017Ans.pdf").load()
    }
}
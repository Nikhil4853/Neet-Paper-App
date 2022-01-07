package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ansset4_y2017.*

class ANSSET4Y2017 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ansset4_y2017)
        AS4Y2017.fromAsset("Set42017Ans.pdf").load()
    }
}
package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ansset2_y2020.*

class ANSSET2Y2020 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ansset2_y2020)
        AnsSET2Y2020.fromAsset("AS2Y2020.pdf").load()
    }
}
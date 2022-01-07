package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ansset12020.*

class ANSSET12020 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ansset12020)
        ANSSET1Y2020pdf.fromAsset("ANSSET1Y2020.pdf").load()
    }
}
package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ansset4_y2.*

class ANSSET4Y2020 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ansset4_y2)
        As4y2020.fromAsset("AS4Y2020.pdf")
            .defaultPage(0)
            .enableAnnotationRendering(true)

            .load()
    }
}
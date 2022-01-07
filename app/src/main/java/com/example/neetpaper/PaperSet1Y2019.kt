package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_paper_set1_y2019.*

class PaperSet1Y2019 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper_set1_y2019)
        S1y2019.fromAsset("Set1y2019.pdf").load()
    }
}
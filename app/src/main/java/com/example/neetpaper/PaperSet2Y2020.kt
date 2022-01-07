package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_paper_set2_y2020.*

class PaperSet2Y2020 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper_set2_y2020)
        PS2Y2020pdf.fromAsset("Set2y2020.pdf").load()
    }
}
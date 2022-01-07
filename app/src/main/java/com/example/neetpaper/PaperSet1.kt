package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_paper_set1.*

class PaperSet1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper_set1)
        Set1y2020pdf.fromAsset("Set1y2020.pdf").load()
    }
}
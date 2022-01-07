package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_paper_set2y2019.*

class PaperSet2y2019 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paper_set2y2019)
        ps2y2019.fromAsset("Set2y2019.pdf").load()
    }
}
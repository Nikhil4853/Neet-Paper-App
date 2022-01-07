package com.example.neetpaper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ansset3_y2017.*

class ANSSET3Y2017 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ansset3_y2017)
        AS3Y2017.fromAsset("Set3y2017Ans.pdf").load()
    }
}
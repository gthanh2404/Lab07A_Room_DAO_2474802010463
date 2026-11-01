package com.example.lab07a

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            text = "Lab 07A - Room Entity & DAO"
            textSize = 20f
            setPadding(48, 48, 48, 48)
        })
    }
}

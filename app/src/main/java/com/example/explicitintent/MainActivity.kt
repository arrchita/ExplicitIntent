package com.example.explicitintent

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun newsScreen(view: View) {
        val i = Intent(applicationContext, MainActivity2::class.java)
        startActivity(i)
    }
}

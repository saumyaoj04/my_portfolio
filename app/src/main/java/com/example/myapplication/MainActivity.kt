package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val and var
        val buttonAchievements= findViewById<Button>(R.id.button2)

        buttonAchievements.setOnClickListener {
            intent= Intent(this,DesignationActivity::class.java)
            startActivity(intent)
        }
    }
}
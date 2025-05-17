package com.example.testdota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_5)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonDrawRanger: Button = findViewById(R.id.buttonDrow)
        val buttonMorf: Button = findViewById(R.id.buttonMorph)
        val buttonDown: Button = findViewById(R.id.buttonDawnbreaker)

        buttonDrawRanger.setOnClickListener {
            Toast.makeText(this,"Неверно", Toast.LENGTH_SHORT).show()
        }
        buttonDown.setOnClickListener {
            Toast.makeText(this,"Неверно", Toast.LENGTH_SHORT).show()
        }
        buttonMorf.setOnClickListener {
            val intent = Intent(this, Activity_6::class.java)
            startActivity(intent)
        }
    }
}
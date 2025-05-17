package com.example.testdota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActicityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_acticity_two)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val axeButton: Button = findViewById(R.id.buttonAxe)
        val abadonButton: Button = findViewById(R.id.buttonAbadon)
        val PaButton: Button = findViewById(R.id.buttonPA)

        axeButton.setOnClickListener{
            Toast.makeText(this,"Неверно", Toast.LENGTH_SHORT).show()
        }
        abadonButton.setOnClickListener {
            Toast.makeText(this,"Неверно", Toast.LENGTH_SHORT).show()
        }
        PaButton.setOnClickListener {
            val intent = Intent(this, activity_3::class.java)
            startActivity(intent)
        }
    }
}
package com.example.testdota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val shadowRazeButton: Button = findViewById(R.id.buttonSF1)
        val necromasteryButton: Button = findViewById(R.id.buttonSF2)
        val reqvievBotton: Button = findViewById(R.id.buttonSF3)

        shadowRazeButton.setOnClickListener {
            val intent = Intent(this, Activity_5::class.java)
            startActivity(intent)
        }
        necromasteryButton.setOnClickListener {
            Toast.makeText(this, "Неверно", Toast.LENGTH_SHORT).show()
        }
        reqvievBotton.setOnClickListener {
            Toast.makeText(this, "Неверно", Toast.LENGTH_SHORT).show()
        }
    }
}
package com.example.testdota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val SfButton: Button = findViewById(R.id.buttonSF)
        val invokerButton: Button = findViewById(R.id.buttonInvoker)
        val PlButton: Button = findViewById(R.id.buttonPL)

        SfButton.setOnClickListener {
            val intent = Intent(this, Activity_4::class.java)
            startActivity(intent)
        }
        invokerButton.setOnClickListener {
            Toast.makeText(this,"Неверно", Toast.LENGTH_SHORT).show()
        }
        PlButton.setOnClickListener {
            Toast.makeText(this,"Неверно", Toast.LENGTH_SHORT).show()
        }
    }
}
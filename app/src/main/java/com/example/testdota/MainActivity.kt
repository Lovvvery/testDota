package com.example.testdota

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val sniperButton: Button = findViewById(R.id.buttonSniper)
        val voidSpirit: Button = findViewById(R.id.buttonVoid)
        val svenButton: Button = findViewById(R.id.buttonSven)

        sniperButton.setOnClickListener {
            val intent = Intent(this, ActicityTwo::class.java)
            startActivity(intent)
        }
        voidSpirit.setOnClickListener {
            Toast.makeText(this,"Неверно",Toast.LENGTH_SHORT).show()
        }
        svenButton.setOnClickListener {
            Toast.makeText(this,"Неверно",Toast.LENGTH_SHORT).show()
        }
    }
}
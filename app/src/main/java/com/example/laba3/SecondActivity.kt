package com.example.laba3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2) // Если файл называется activity_main2.xml, поменяйте здесь

        val textView = findViewById<TextView>(R.id.textView3)
        val button = findViewById<Button>(R.id.button2)

        // Получаем текст из Intent
        val receivedText = intent.getStringExtra("text2remember")
        textView.text = receivedText

        // Возврат на первый экран
        button.setOnClickListener {
            finish()
        }
    }
}
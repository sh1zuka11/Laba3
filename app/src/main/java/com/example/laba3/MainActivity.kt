package com.example.laba3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editTextText)
        val button = findViewById<Button>(R.id.button)

        // Восстанавливаем текст при возврате
        val savedText = intent.getStringExtra("text2remember")
        if (savedText != null) {
            editText.setText(savedText)
        }

        // --- АВТОМАТИЧЕСКИЙ ВЫЗОВ КЛАВИАТУРЫ ---
        editText.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT)
        // ---------------------------------------

        button.setOnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("text2remember", editText.text.toString())
            startActivity(intent)
        }
    }
}
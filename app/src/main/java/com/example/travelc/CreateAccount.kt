package com.example.travelc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.travelc.databinding.CreateAccountBinding

class CreateAccount : AppCompatActivity() {
    private lateinit var binding: CreateAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CreateAccountBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonCreateaccount.setOnClickListener {
            // Finish the current activity to go back to the previous one
            finish()
        }
    }
}

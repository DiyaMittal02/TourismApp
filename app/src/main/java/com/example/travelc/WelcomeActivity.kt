package com.example.travelc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.travelc.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listener for the continue button
        binding.continueButton.setOnClickListener {
            // Navigate to the login page
            startActivity(Intent(this, ActivityViewMore::class.java))
            finish() // Finish the welcome activity
        }
    }
}
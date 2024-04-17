package com.example.travelc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.travelc.databinding.NextActivityBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: NextActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NextActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            // Start the WelcomeActivity after clicking the login button
            startActivity(Intent(this, WelcomeActivity::class.java))
            finish() // Finish the current activity
        }
    }
}

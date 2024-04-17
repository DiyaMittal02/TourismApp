package com.example.travelc
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.travelc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Post a delayed action to start ActivityViewMore after 3 seconds
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, ActivityViewMore::class.java)
            startActivity(intent)
            finish() // Optional: Finish MainActivity after starting ActivityViewMore
        }, 10000) // 3000 milliseconds = 3 seconds

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }

        val buttonCreateAccount = findViewById<Button>(R.id.button_createaccount)

        // Set OnClickListener for the "Create Account" button
        buttonCreateAccount.setOnClickListener {
            // Start CreateAccountActivity when the button is clicked
            val intent = Intent(this, CreateAccount::class.java)
            startActivity(intent)
        }
    }
}
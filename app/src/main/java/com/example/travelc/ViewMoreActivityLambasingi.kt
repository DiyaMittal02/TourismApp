package com.example.travelc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.travelc.databinding.ActivityViewMoreLambasingiBinding


class ViewMoreActivityLambasingi : AppCompatActivity() {
    private lateinit var binding: ActivityViewMoreLambasingiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewMoreLambasingiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Set OnClickListener for the "Back" option
        binding.buttonBack.setOnClickListener {
            // Finish the current activity to go back to the previous one
            finish()
        }
    }
}
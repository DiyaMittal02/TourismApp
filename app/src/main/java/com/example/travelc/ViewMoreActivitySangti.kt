package com.example.travelc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.travelc.databinding.ActivityViewMoreSangtiBinding


class ViewMoreActivitySangti : AppCompatActivity() {
    private lateinit var binding: ActivityViewMoreSangtiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewMoreSangtiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Set OnClickListener for the "Back" option
        binding.buttonBack.setOnClickListener {
            // Finish the current activity to go back to the previous one
            finish()
        }
    }
}
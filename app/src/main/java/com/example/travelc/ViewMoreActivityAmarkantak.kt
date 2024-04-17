package com.example.travelc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.travelc.databinding.ActivityViewMoreAmarkantakBinding

class ViewMoreActivityAmarkantak : AppCompatActivity() {
    private lateinit var binding: ActivityViewMoreAmarkantakBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewMoreAmarkantakBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Set OnClickListener for the "Back" option
        binding.buttonBack.setOnClickListener {
            // Finish the current activity to go back to the previous one
            finish()
        }
    }
}

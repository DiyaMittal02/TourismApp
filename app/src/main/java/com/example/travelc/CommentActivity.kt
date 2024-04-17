package com.example.travelc

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.travelc.databinding.ActivityCommentBinding

class CommentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCommentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve the array of ratings from the resources
        val ratingsArray = resources.getStringArray(R.array.ratings)

        // Create an ArrayAdapter using the ratings array
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, ratingsArray)

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
        binding.spinnerRating.adapter = adapter

        // Handle button click
        binding.buttonSubmit.setOnClickListener {
            // Get the selected rating
            val selectedRating = binding.spinnerRating.selectedItem.toString()
            // Get the entered name, email, comment, date, location, and additional feedback
            val name = binding.editName.text.toString()
            val email = binding.editEmail.text.toString()
            val comment = binding.editComment.text.toString()
            val date = binding.editDate.text.toString()
            val location = binding.editLocation.text.toString()
            val additionalFeedback = binding.editAdditionalFeedback.text.toString()

            // Process the selected rating and other inputs here
            // For now, let's just display them
            val message = "Selected Rating: $selectedRating\n" +
                    "Name: $name\n" +
                    "Email: $email\n" +
                    "Comment: $comment\n" +
                    "Date of Visit: $date\n" +
                    "Location: $location\n" +
                    "Additional Feedback: $additionalFeedback"

            // Display a toast message with the selected rating and other inputs
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            // You can perform further actions with the inputs here
        }

        // Set up navigation back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed() // Navigate back when the back button is clicked
        return true
    }
}

// UserInfoActivity.kt
package com.example.travelc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.travelc.databinding.ActivityUserInfoBinding

class UserInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve user information from intent extras
        val userName = intent.getStringExtra("userName")
        val account = intent.getStringExtra("account")
        val email = intent.getStringExtra("email")
        val phoneNumber = intent.getStringExtra("phoneNumber")
        val review = intent.getStringExtra("review")

        // Set user information to TextViews
        binding.textWelcome.text = "Welcome, $userName"
        binding.textName.text = "Name: $userName"
        binding.textAccount.text = "Account: $account"
        binding.textEmail.text = "Email: $email"
        binding.textPhoneNumber.text = "Phone Number: $phoneNumber"
        binding.textReview.text = "Review: $review"

        // Set onClickListener for the "Comment" button
        binding.buttonComment.setOnClickListener {
            // Start the CommentActivity
            val intent = Intent(this, CommentActivity::class.java)
            startActivity(intent)
        }
    }
}

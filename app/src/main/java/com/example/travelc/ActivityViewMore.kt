package com.example.travelc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.travelc.databinding.ActivityViewMoreBinding

class ActivityViewMore : AppCompatActivity() {
    private lateinit var binding: ActivityViewMoreBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewMoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Find the profile icon ImageView
        val profileIcon: ImageView = findViewById(R.id.profileIcon)

        // Set an onClickListener to the profile icon
        profileIcon.setOnClickListener {
            // Create an intent to start the UserInfoActivity
            val intent = Intent(this, UserInfoActivity::class.java)
            // Add any extra data needed to be passed to the UserInfoActivity
            intent.putExtra("userName", "John Doe")
            intent.putExtra("account", "Standard")
            intent.putExtra("email", "john.doe@example.com")
            intent.putExtra("phoneNumber", "1234567890")
            intent.putExtra("review", "Great experience!")
            startActivity(intent)
        }

        // Set onClickListeners for other buttons as before
        val buttonViewMore = findViewById<Button>(R.id.button_view_more)
        buttonViewMore.setOnClickListener {
            val intent = Intent(this, ActivityViewMore::class.java)
            startActivity(intent)
        }

        val buttonViewMoreAmarkantak = findViewById<Button>(R.id.button_view_more_amarkantak)
        buttonViewMoreAmarkantak.setOnClickListener {
            val intent = Intent(this, ViewMoreActivityAmarkantak::class.java)
            startActivity(intent)
        }

        val buttonViewMoreLambasingi = findViewById<Button>(R.id.button_view_more_lambasingi)
        buttonViewMoreLambasingi.setOnClickListener {
            val intent = Intent(this, ViewMoreActivityLambasingi::class.java)
            startActivity(intent)
        }
        val buttonViewMoreActivitySangti = findViewById<Button>(R.id.button_view_more_sangti)
        buttonViewMoreActivitySangti.setOnClickListener {
            val intent = Intent(this, ViewMoreActivityLambasingi::class.java)
            startActivity(intent)
        }
        val buttonViewMoreActivityTawang = findViewById<Button>(R.id.button_view_more_tawang)
        buttonViewMoreActivitySangti.setOnClickListener {
            val intent = Intent(this, ViewMoreActivityLambasingi::class.java)
            startActivity(intent)
        }



        // Add onClickListeners for other buttons as needed
    }
}

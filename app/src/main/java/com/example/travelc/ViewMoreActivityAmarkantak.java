package com.example.travelc;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ViewMoreActivityAmarkantak extends AppCompatActivity {
    private WebView webView;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_more_amarkantak);

        // Find the WebView and Button by their ids
        webView = findViewById(R.id.webView);
        backButton = findViewById(R.id.buttonBack);

        // Enable JavaScript (optional)
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Load HTML file from assets folder
        webView.loadUrl("file:///android_asset/index.html");

        // Set WebViewClient to handle links within WebView
        webView.setWebViewClient(new WebViewClient());

        // Set OnClickListener for the "Back" button
        backButton.setOnClickListener(view -> {
            // Check if the WebView can go back
            if (webView.canGoBack()) {
                // Go back in WebView's history
                webView.goBack();
            } else {
                // If WebView cannot go back, finish the activity
                finish();
            }
        });
    }
}

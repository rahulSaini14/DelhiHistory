package com.example.android.delhihistory;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        Toast.makeText(this , "Loading..." , Toast.LENGTH_LONG).show();
        WebView webView = (WebView) findViewById(R.id.web);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.loadUrl("https://www.google.com/maps/d/viewer?mid=1sSYHQjnIzACGYMHktigFJd99WpI&hl=en_US&ll=28.633664904841456%2C77.20749699999999&z=13");
    }
}

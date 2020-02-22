package pl.ciecierski.szwalbe2;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Www1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundcloud_webview);
        WebView webView = findViewById(R.id.webview);
        webView.loadUrl("https://szwalbe.byd.pl");

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        this.onBackPressed();
    }

}

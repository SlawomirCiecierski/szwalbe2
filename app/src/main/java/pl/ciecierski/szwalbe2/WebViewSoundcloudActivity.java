package pl.ciecierski.szwalbe2;


import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewSoundcloudActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundcloud_webview);
        WebView webView=findViewById(R.id.webview);
                webView.loadUrl("https://soundcloud.com/s-awomir-ciecierski/szwalbe");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_scrolling_upa);



    }
}

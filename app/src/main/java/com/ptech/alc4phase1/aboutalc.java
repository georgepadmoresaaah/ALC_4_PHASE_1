package com.ptech.alc4phase1;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class aboutalc extends AppCompatActivity {

    private WebView webviewALC;


    AppCompatActivity activity;

    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutalc);
        getSupportActionBar().setTitle("About ALC");
        activity = this;


        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading page......");
        progressDialog.setTitle("Please Wait");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);


        webviewALC = findViewById(R.id.web_view);
        WebSettings webSettings = webviewALC.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webviewALC.getSettings().setDomStorageEnabled(true);

        progressDialog.show();

        webviewALC.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return super.shouldOverrideUrlLoading(view, url);
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);

            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);

                progressDialog.dismiss();
            }

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });


        webviewALC.loadUrl("https://andela.com/alc/");


    }
}
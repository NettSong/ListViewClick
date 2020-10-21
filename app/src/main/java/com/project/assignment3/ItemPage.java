package com.project.assignment3;


import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ItemPage extends AppCompatActivity {
    private WebView webView;
    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_page);


        mToolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar((Toolbar) mToolbar);
        ((Toolbar) mToolbar).setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//
//
//
//        mToolbar.setNavigationIcon(mDrawable);

        Bundle b=getIntent().getExtras();
        //获取Bundle的信息
        String link = b.getString("itemLink");
        webView = (WebView) findViewById(R.id.web_view);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(link);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
    }

}
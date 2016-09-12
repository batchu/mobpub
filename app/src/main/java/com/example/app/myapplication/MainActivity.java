package com.example.app.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mopub.mobileads.MoPubView;

public class MainActivity extends AppCompatActivity {

    private MoPubView moPubView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moPubView = (MoPubView) findViewById(R.id.adview);
        moPubView.setAdUnitId("c9c2ea9a8e1249b68496978b072d2fd2"); // Enter your Ad Unit ID from www.mopub.com
        moPubView.loadAd();
    }
}

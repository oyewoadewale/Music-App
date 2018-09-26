package com.example.hp.lmamapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

// This is the now playing activity
    // it extends AppCompatActivity
    // that means we get to use the code developped by the android team
// in the class AppCompatActivityfor free
    @Override

    // but here we override some method so it can give us our desired specification
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

    }
}

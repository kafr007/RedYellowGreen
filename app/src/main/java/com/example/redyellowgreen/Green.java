package com.example.redyellowgreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Green extends AppCompatActivity {
    private static int TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.green);
        Intent intent = getIntent();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Green.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }

    private void mainChooser(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

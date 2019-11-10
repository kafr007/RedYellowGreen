package com.example.redyellowgreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linearLayout = null;

    // Button1 and button2 is added in layout xml file.
    private Button button1 = null;
    private Button button2 = null;
    private Button button3 = null;

    private Context context = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (linearLayout == null) {
            linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        }

        if (button1 == null) {
            button1 = (Button) findViewById(R.id.redButton);
        }

        if (button2 == null) {
            button2 = (Button) findViewById(R.id.yellowButton);
        }

        if (button3 == null) {
            button3 = (Button) findViewById(R.id.greenButton);
        }

        if (context == null) {
            context = getApplicationContext();
        }

        /* Must set the on click listener to this activity,
           otherwise the override onClick method will bot be invoked.*/
        linearLayout.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v != null) {
            // Get view component id.
            int id = v.getId();

            if (id == R.id.redButton) {
                Intent intent = new Intent(this, Red.class);
                startActivity(intent);
            } else if (id == R.id.yellowButton) {
                Intent intent = new Intent(this, Yellow.class);
                startActivity(intent);
            } else if (id == R.id.greenButton) {
                Intent intent = new Intent(this, Green.class);
                startActivity(intent);
            }
        }
    }
}
package com.example.kunal.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Layout
        RelativeLayout kdsLayout = new RelativeLayout(this);
        kdsLayout.setBackgroundColor(Color.GREEN);

        //Button
        Button redButton = new Button(this);
        redButton.setText("Click Me");
        redButton.setBackgroundColor(Color.RED);

        //Add widget to Layout (button is now a child of Layout)
        kdsLayout.addView(redButton);

        //set this activity/ display to this view
        setContentView(kdsLayout);

    }
}
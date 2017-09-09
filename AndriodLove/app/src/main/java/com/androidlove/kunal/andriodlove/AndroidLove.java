package com.androidlove.kunal.andriodlove;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AndroidLove extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_love);
    }

    public void onClickAction (View view) {
        TextView textView = (TextView) findViewById(R.id.haikuText);
        textView.setVisibility(View.VISIBLE);
    }
}

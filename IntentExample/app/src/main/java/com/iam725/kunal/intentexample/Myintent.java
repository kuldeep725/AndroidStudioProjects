package com.iam725.kunal.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Myintent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_main);
    }
    public void onClickButton(View view) {
        Intent i = new Intent(this,SubMain.class);
        EditText mainInput = (EditText)findViewById(R.id.mainInput);
        String userInput = mainInput.getText().toString();
        i.putExtra("mainMessage",userInput);
        startActivity(i);
    }
}

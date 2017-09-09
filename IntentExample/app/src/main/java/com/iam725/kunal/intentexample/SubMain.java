package com.iam725.kunal.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SubMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main);

        Bundle mainData = getIntent().getExtras();
        if(mainData == null) {
            return;
        }
        else{
            String newShowData = mainData.getString("mainMessage");
            TextView subInput = (TextView) findViewById(R.id.SubInput);
            subInput.setText(newShowData);
        }
    }
    public void onClickBackButton(View view){

        Intent i = new Intent(this,Myintent.class);
        startActivity(i);

    }
}

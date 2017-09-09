package com.iam725.kunal.creditcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    SignUp signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUp = new SignUp();
    }

    public void onSignUpButton(View view) {
        intent = new Intent(this,SignUp.class);
        startActivity(intent);
    }

    public void onAdminSignInButton(View view) {
        intent = new Intent(this,AdminSignIn.class);
        startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}

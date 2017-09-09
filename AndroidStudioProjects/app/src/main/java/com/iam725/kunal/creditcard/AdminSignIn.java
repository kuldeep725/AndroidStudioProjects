package com.iam725.kunal.creditcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AdminSignIn extends AppCompatActivity {

    final String ADMIN_EMAIL_ID = "kunal725725@gmail.com";
    final String ADMIN_PASSWORD = "123";
    //final String ADMIN_PASSWORD = "iamAdmin@725";

    String user_email_id, user_password;
    EditText email_id_text, password_text;
    Intent intent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_sign_in);

        email_id_text = (EditText) findViewById(R.id.email_id_check);
        password_text = (EditText) findViewById(R.id.password_check);
        
    }


    public void onAdminSignInButton(View view) {
        
        user_email_id = email_id_text.getText().toString();
        user_password = password_text.getText().toString();
        
        if (ADMIN_EMAIL_ID.equals(user_email_id) && ADMIN_PASSWORD.equals(user_password)) {
            Toast.makeText(this,"Hello Admin !!",Toast.LENGTH_SHORT).show();
            intent = new Intent(this, UserDetailForAdmin.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,"YOU ARE NOT ADMIN !!",Toast.LENGTH_SHORT).show();
            password_text.setText("");
        }
    }
}

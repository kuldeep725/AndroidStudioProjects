package com.iam725.kunal.players_eleven;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class DisplayData extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_data);

        TextView name_display = (TextView) findViewById(R.id.name_display);
        TextView age_display = (TextView) findViewById(R.id.age_display);
        TextView email_id_display = (TextView) findViewById(R.id.email_id_display);
        TextView password_display = (TextView) findViewById(R.id.password_display);
        TextView phone_number_display = (TextView) findViewById(R.id.phone_number_display);

        Bundle i = getIntent().getExtras();

        if (i == null) {
            return;
        }

        name_display.setText("Your Name is " + i.getString("name") + ".");
        age_display.setText("Your Age is " + i.getString("age") + ".");
        email_id_display.setText("Your Email-id is " + i.getString("email_id") + ".");
        password_display.setText("Your Password is " + i.getString("password") + ".");
        phone_number_display.setText("Your Phone Number is " + i.getString("phone_number") + ".");

    }
    public void onClickGoButton(View view) {
        finish();
    }





}

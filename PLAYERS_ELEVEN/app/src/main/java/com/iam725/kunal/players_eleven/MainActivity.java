package com.iam725.kunal.players_eleven;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name_input = (EditText)findViewById(R.id.name_input);
        final EditText age_input = (EditText)findViewById(R.id.age_input);
        final EditText email_id_input = (EditText)findViewById(R.id.email_id_input);
        final EditText password_input = (EditText)findViewById(R.id.password_input);
        final EditText phone_number_input = (EditText)findViewById(R.id.phone_number_input);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(MainActivity.this, DisplayData.class);
                        i.putExtra("name",name_input.getText().toString());
                        i.putExtra("age",age_input.getText().toString());
                        i.putExtra("email_id",email_id_input.getText().toString());
                        i.putExtra("password",password_input.getText().toString());
                        i.putExtra("phone_number",phone_number_input.getText().toString());
                        startActivity(i);
                    }
                }
        );
    }
}

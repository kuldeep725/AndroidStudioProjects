package com.iam725.kunal.creditcard;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    protected static SQLiteDatabase database;
    static EditText name_text;
    static EditText age_text;
    static EditText city_text;
    static EditText occupation_text;
    static EditText qualification_text;
    static EditText annual_income_text;
    static EditText pan_card_text;
    static EditText email_id_text;
    static EditText password_text;
    static EditText phone_number_text;
    final static String DATABASE_NAME = "CreditCardSystem";
    final static String TABLE_NAME = "CreditCard";
    UserDetailForAdmin obj;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        name_text = (EditText) findViewById(R.id.name_text);
        age_text = (EditText) findViewById(R.id.age_text);
        city_text = (EditText) findViewById(R.id.city_text);
        occupation_text = (EditText) findViewById(R.id.occupation_text);
        qualification_text = (EditText) findViewById(R.id.qualification_text);
        annual_income_text = (EditText) findViewById(R.id.annual_income_text);
        pan_card_text = (EditText) findViewById(R.id.pan_card_text);
        email_id_text = (EditText) findViewById(R.id.email_id_check);
        password_text = (EditText) findViewById(R.id.password_check);
        phone_number_text = (EditText) findViewById(R.id.phone_number_text);

    }

    public void onSignUpButton(View view) {

        createDatabase();
        addMember();
        Toast.makeText(this,"YOU HAVE SUCCESSFULLY SIGNED UP.",Toast.LENGTH_LONG).show();
        finish();

    }



    protected void createDatabase() {
        try {
            database = this.openOrCreateDatabase(DATABASE_NAME, MODE_PRIVATE, null);
            database.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    "name_text VARCHAR,"+
                    "age_text VARCHAR,"+
                    "city_text VARCHAR,"+
                    "occupation_text VARCHAR,"+
                    "qualification_text VARCHAR,"+
                    "annual_income_text VARCHAR,"+
                    "pan_card_text VARCHAR,"+
                    "email_id_text VARCHAR,"+
                    "password_text VARCHAR,"+
                    "phone_number_text VARCHAR);"
            );

        }
        catch (Exception e) {
            Log.e("Database error","ERROR IN CREATING DATABASE");
        }
    }

    private static void addMember() {

        ContentValues contentValues = new ContentValues();

        contentValues.put("name_text",name_text.getText().toString());
        contentValues.put("age_text",age_text.getText().toString());
        contentValues.put("city_text",city_text.getText().toString());
        contentValues.put("occupation_text",occupation_text.getText().toString());
        contentValues.put("qualification_text",qualification_text.getText().toString());
        contentValues.put("annual_income_text",annual_income_text.getText().toString());
        contentValues.put("pan_card_text",pan_card_text.getText().toString());
        contentValues.put("email_id_text",email_id_text.getText().toString());
        contentValues.put("password_text",password_text.getText().toString());
        contentValues.put("phone_number_text",phone_number_text.getText().toString());

        database.insert(TABLE_NAME,null,contentValues);

    }

    public static Cursor getDatabaseInfo() {
        return database.rawQuery("SELECT * FROM " + TABLE_NAME,null);
    }

    public void deleteUserInfo() {
        deleteDatabase(DATABASE_NAME);
        finish();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    /*@Override
    protected void onDestroy() {
        super.onDestroy();
        database.close();
    }*/

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}

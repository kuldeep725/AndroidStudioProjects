package com.iam725.kunal.creditcard;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

class UserDetailAdapter extends CursorAdapter{

    protected UserDetailAdapter(Context context, Cursor c) {
        super(context, c);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.user_total_detail,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView member_text = (TextView) view.findViewById(R.id.member_text);
        TextView name_text = (TextView) view.findViewById(R.id.name_text);
        TextView  age_text = (TextView) view.findViewById(R.id.age_text);
        TextView city_text = (TextView) view.findViewById(R.id.city_text);
        TextView  occupation_text = (TextView) view.findViewById(R.id.occupation_text);
        TextView qualification_text = (TextView) view.findViewById(R.id.qualification_text);
        TextView annual_income_text = (TextView) view.findViewById(R.id.annual_income_text);
        TextView  pan_card_text = (TextView) view.findViewById(R.id.pan_card_text);
        TextView email_id_text = (TextView) view.findViewById(R.id.email_id_check);
        TextView password_text = (TextView) view.findViewById(R.id.password_check);
        TextView phone_number_text = (TextView) view.findViewById(R.id.phone_number_text);

        cursor.moveToFirst();
        try {
            if (cursor != null && cursor.getCount() > 0) {

                do {
                    String str = "MEMBER " + cursor.getString(cursor.getColumnIndex("_id"));
                    member_text.setText(str);
                    name_text.setText(cursor.getString(cursor.getColumnIndex("name_text")));
                    age_text.setText(cursor.getString(cursor.getColumnIndex("age_text")));
                    city_text.setText(cursor.getString(cursor.getColumnIndex("city_text")));
                    occupation_text.setText(cursor.getString(cursor.getColumnIndex("occupation_text")));
                    qualification_text.setText(cursor.getString(cursor.getColumnIndex("qualification_text")));
                    String income = "Rs. "+cursor.getString(cursor.getColumnIndex("annual_income_text"));
                    annual_income_text.setText(income);
                    pan_card_text.setText(cursor.getString(cursor.getColumnIndex("pan_card_text")));
                    email_id_text.setText(cursor.getString(cursor.getColumnIndex("email_id_text")));
                    password_text.setText(cursor.getString(cursor.getColumnIndex("password_text")));
                    String phone_number = "+91" + cursor.getString(cursor.getColumnIndex("phone_number_text"));
                    phone_number_text.setText(phone_number);
                } while (cursor.moveToNext());
                cursor.close();
            }
        }
        catch (Exception e){
            Toast.makeText(context.getApplicationContext(),"No Results to show ! ",Toast.LENGTH_LONG).show();
            new AppCompatActivity().finish();
        }




    }
}

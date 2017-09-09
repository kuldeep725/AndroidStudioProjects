package com.iam725.kunal.creditcard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

public class UserDetailForAdmin extends AppCompatActivity {

    ListView listView;
    UserDetailAdapter adapter;
    SignUp signUp;

    public UserDetailForAdmin () {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_detail_for_admin);

        signUp = new SignUp();
        listView = (ListView) findViewById(R.id.list_item);
        adapter = new UserDetailAdapter(this,SignUp.getDatabaseInfo());
        listView.setAdapter(adapter);
        adapter.changeCursor(SignUp.getDatabaseInfo());

    }

    public void onDeleteButton(View view) {

        signUp.deleteUserInfo();

    }

}

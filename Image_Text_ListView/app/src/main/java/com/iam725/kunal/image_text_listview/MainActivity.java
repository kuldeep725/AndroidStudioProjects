package com.iam725.kunal.image_text_listview;
//NOT WORKING PROPERLY
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] names = {"ShikharDhawan","MSDhoni","Virat Kohli","Rohit Sharma","Sachin Tendulkar","Yuvraj Singh"};

        ListView myListView = (ListView) findViewById(R.id.myListView);
        ListAdapter mylistAdapter = new CustomAdapter(this,names);
        myListView.setAdapter(mylistAdapter);
        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String name = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this,name,Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}

package com.iam725.kunal.image_text_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by kunal on 7/6/17.
 */

class CustomAdapter extends ArrayAdapter<String> {



    CustomAdapter(@NonNull Context context, String[] names) {
        super(context, R.layout.custom_layout,names);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        int[] players = {R.id.dhawan_text,R.id.dhoni_text,R.id.kohli_text,R.id.rohit_text,R.id.sachin_text,R.id.yuvraj_text};
        int[] players_image = {R.id.dhawan_image,R.id.dhoni_image,R.id.kohli_image,R.id.rohit_image,R.id.sachin_image,R.id.yuvraj_image};
        int[] image = {R.mipmap.dhawan,R.mipmap.dhoni,R.mipmap.kohli,R.mipmap.rohit,R.mipmap.sachin,R.mipmap.yuvi};
        String[] names = {"Shikhar","MSDhoni","Virat Kohli","Rohit Sharma","Sachin Tendulkar","Yuvraj Singh"};

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.custom_layout,parent,false);

        String name = getItem(position);
        //TextView textView = (TextView) view.findViewById(players[position]);
        //ImageView imageView = (ImageView) view.findViewById(players_image[position]);
        TextView textView = (TextView) view.findViewById(players[position]);
        ImageView imageView = (ImageView) view.findViewById(players_image[position]);

        textView.setText(names[position]);
        imageView.setImageResource(image[position]);
        return view;
    }
}

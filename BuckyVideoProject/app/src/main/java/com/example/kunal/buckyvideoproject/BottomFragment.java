package com.example.kunal.buckyvideoproject;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by kunal on 4/6/17.
 */

public class BottomFragment extends Fragment {
    private static TextView top;
    private static TextView bottom;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bottom_fragment,container,false);
        top = (TextView) v.findViewById(R.id.topmost);
        bottom = (TextView) v.findViewById(R.id.bottommost);
        return v;
    }
    public void setMemeText(String top_text, String bottom_text){
        top.setText(top_text);
        bottom.setText(bottom_text);
    }


}

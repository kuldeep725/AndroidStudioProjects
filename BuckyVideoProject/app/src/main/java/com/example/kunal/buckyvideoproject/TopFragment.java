package com.example.kunal.buckyvideoproject;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kunal on 4/6/17.
 */

public class TopFragment extends Fragment {
    private static EditText topEditText;
    private static EditText bottomEditText;
    TopFragmentListener listener;

    public interface TopFragmentListener {
        void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            listener = (TopFragmentListener) activity;
        }
        catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.top_fragment,container,false);
        topEditText = (EditText) v.findViewById(R.id.topEditText);
        bottomEditText = (EditText) v.findViewById(R.id.bottomEditText);
        final Button button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        onClickedButton(v);
                    }
                }
        );
        return v;
    }
    public void onClickedButton(View v){
        listener.createMeme(topEditText.getText().toString(),bottomEditText.getText().toString());
    }


}

package com.iam725.kunal.tranny;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    ViewGroup v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v = (ViewGroup) findViewById(R.id.activity_main);
        v.setOnTouchListener(
                new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        moveButton();
                        return true;
                    }
                }
        );

    }
    public void moveButton() {

        View button = findViewById(R.id.button);

        TransitionManager.beginDelayedTransition(v);

        //to set position of button
        RelativeLayout.LayoutParams posRules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        posRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
        posRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,RelativeLayout.TRUE);
        button.setLayoutParams(posRules);

        //to set size of button
        ViewGroup.LayoutParams sizeRules = button.getLayoutParams();
        sizeRules.width = 450;
        sizeRules.height = 300;
        button.setLayoutParams(sizeRules);

    }
}

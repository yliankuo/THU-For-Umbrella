package com.example.umbrellatartanhacks;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.widget.TextView;
import java.sql.Time;

public class Details extends AppCompatActivity {
    private Button button_small;
    private Button button_big;
    private Button button_submit;
    private ImageButton button_up;
    private ImageButton button_dwn;
    private boolean sb = false;
    private TextView timer;
    String size;
    Time t;
    int offset = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        button_small = (Button)findViewById(R.id.btn_small);
        button_big = (Button)findViewById(R.id.btn_big);
        button_submit = (Button)findViewById(R.id.btn_submit);



        button_up = (ImageButton)findViewById(R.id.btn_up);
        button_dwn = (ImageButton)findViewById(R.id.btn_dwn);
        timer = (TextView)findViewById(R.id.btn_timer);
        button_submit = (Button)findViewById(R.id.btn_submit);
        button_small.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                size = "Small";
            }

        });

        button_dwn.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN && offset > 0){
                    offset -= 1;
                }
                timer.setText(Integer.toString(offset));
                return true;
            }

        });

        button_up.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN && offset < 240){
                    offset += 1;
                }
                timer.setText(Integer.toString(offset));
                return true;
            }

        });
        button_big.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                size = "Big";
                button_big.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.color.colorPrimaryDark));
                button_small.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.color.colorPrimary));
            }

        });
        button_small.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                size = "Small";
                button_small.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.color.colorPrimaryDark));
                button_big.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.color.colorPrimary));
            }

        });

        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Submit sb
                sb = false;
            }
        });
    }
}
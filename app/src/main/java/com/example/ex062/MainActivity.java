package com.example.ex062;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    LinearLayout LL;
    Switch switch1;
    RadioGroup rG;
    RadioButton rB1, rB2, rB3, rB4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LL = (LinearLayout) findViewById(R.id.LL);
        switch1 = (Switch) findViewById(R.id.switch1);
        rG = (RadioGroup) findViewById(R.id.rG);
        rB1 = (RadioButton) findViewById(R.id.rB1);
        rB2 = (RadioButton) findViewById(R.id.rB2);
        rB3 = (RadioButton) findViewById(R.id.rB3);
        rB4 = (RadioButton) findViewById(R.id.rB4);
    }


    public void onClick1(View view) {
        if(switch1.isChecked()){
            LL.setBackgroundColor(Color.BLUE);
        }
    }

    public void onClick2(View view) {
        if(switch1.isChecked()){
            LL.setBackgroundColor(Color.YELLOW);
        }
    }

    public void onClick3(View view) {
        if(switch1.isChecked()){
            LL.setBackgroundColor(Color.RED);
        }
    }

    public void onClick4(View view) {
        if(switch1.isChecked()){
            LL.setBackgroundColor(Color.BLACK);
        }
    }

    public void go(View view) {
        if(switch1.isChecked() == false){
            if(rB1.isChecked()){
                LL.setBackgroundColor(Color.BLUE);
            }
            if(rB2.isChecked()){
                LL.setBackgroundColor(Color.YELLOW);
            }
            if(rB3.isChecked()){
                LL.setBackgroundColor(Color.RED);
            }
            if(rB4.isChecked()){
                LL.setBackgroundColor(Color.BLACK);
            }
        }
    }
}
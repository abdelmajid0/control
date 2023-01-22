package com.example.control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    TextView editText1;
    Button btn1,btn2,btn3;
    LinearLayout layoutview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        editText1 = findViewById(R.id.editText1);
        layoutview1 = findViewById(R.id.layoutview1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                for(int loop = 0; loop < layoutview1.getChildCount(); loop++) {
                    //this is the code in question and where I want to get the text from
                    //all my EditTexts
                    TextView inner = (TextView) layoutview1.getChildAt(loop);
                    inner.setText("? *"+String.format(" %s ",loop+1)+"= ?");


                }
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }


}
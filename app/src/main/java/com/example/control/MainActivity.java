package com.example.control;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    TextView editText1;
    Button btn1,btn2,btn3,buttonColor1,buttonColor2,buttonColor3;
    LinearLayout layoutview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        editText1 = findViewById(R.id.editText1);
        buttonColor1 = findViewById(R.id.buttonColor1);buttonColor2 = findViewById(R.id.buttonColor2);buttonColor3 = findViewById(R.id.buttonColor3);
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
                if (editText1.getText().toString().trim().length()>0){
                    for(int loop = 0; loop < layoutview1.getChildCount(); loop++) {
                        //this is the code in question and where I want to get the text from
                        //all my EditTexts
                        TextView inner = (TextView) layoutview1.getChildAt(loop);
                        int a = Integer.parseInt(String.format("%s",editText1.getText()));
                        inner.setText(String.format("%s * %s = %s",a,loop+1,(loop+1)*a));
                    }
                }
                else {
                    editText1.setText("");
                    for(int loop = 0; loop < layoutview1.getChildCount(); loop++) {
                        //this is the code in question and where I want to get the text from
                        //all my EditTexts
                        TextView inner = (TextView) layoutview1.getChildAt(loop);
                        inner.setText("? *"+String.format(" %s ",loop+1)+"= ?");
                    }
                    Toast.makeText(MainActivity.this, "Edite text moust be not empty!!", Toast.LENGTH_LONG).show();
                }
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });


        buttonColor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFFFF"));
            }
        });
        buttonColor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#E453EE"));
            }
        });
        buttonColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#846CAF"));
            }
        });

    }


}
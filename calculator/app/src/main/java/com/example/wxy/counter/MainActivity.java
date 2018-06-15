package com.example.wxy.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity/* implements View.OnClickListener*/{

    protected TextView textview1;
    String input1 = "",input2 = "";
    String f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        /////////////////////////////////////////////////////////////////////////按钮定义
        ImageButton button1 = (ImageButton) findViewById(R.id.button_1);
        ImageButton button2 = (ImageButton) findViewById(R.id.button_2);
        ImageButton button3 = (ImageButton) findViewById(R.id.button_3);
        ImageButton button4 = (ImageButton) findViewById(R.id.button_4);
        ImageButton button5 = (ImageButton) findViewById(R.id.button_5);
        ImageButton button6 = (ImageButton) findViewById(R.id.button_6);
        ImageButton button7 = (ImageButton) findViewById(R.id.button_7);
        ImageButton button8 = (ImageButton) findViewById(R.id.button_8);
        ImageButton button9 = (ImageButton) findViewById(R.id.button_9);
        ImageButton button0 = (ImageButton) findViewById(R.id.button_0);
        ImageButton buttona = (ImageButton) findViewById(R.id.button_a);
        ImageButton buttonb = (ImageButton) findViewById(R.id.button_b);
        ImageButton buttonc = (ImageButton) findViewById(R.id.button_c);//
        ImageButton buttond = (ImageButton) findViewById(R.id.button_d);
        ImageButton buttone = (ImageButton) findViewById(R.id.button_e);
        //////////////////////////////////////////////////////////////////////////
        final TextView textview1 = (TextView) findViewById(R.id.text1);
        final TextView textview2 = (TextView) findViewById(R.id.text2);

        int n1, n2, n3;
        final String output;
        /*
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            //output_c[] = output.toCharArray();
            public void onClick(View v) {
                textview1.setText("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText("9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setText("0");
            }
        });
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText("+");
            }
        });
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText("-");
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText("x");
            }
        });
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText("÷");
            }
        });
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview2.setText("=");
            }
        });*/

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            //output_c[] = output.toCharArray();
            public void onClick(View v) {
                input1 += "1";
                textview1.setText(input1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 += "2";
                textview1.setText(input1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 += "3";
                textview1.setText(input1);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 += "4";
                textview1.setText(input1);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 += "5";
                textview1.setText(input1);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 += "6";
                textview1.setText(input1);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 += "7";
                textview1.setText(input1);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 += "8";
                textview1.setText(input1);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 += "9";
                textview1.setText(input1);
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 += "0";
                textview1.setText(input1);
            }
        });
        buttona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = "+";
                textview2.setText(f);
            }
        });
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = "-";
                textview2.setText(f);
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = "×";
                textview2.setText(f);
            }
        });
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = "÷";
                textview2.setText(f);
            }
        });
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f = "=";
                textview2.setText(f);
            }
        });

    }

}

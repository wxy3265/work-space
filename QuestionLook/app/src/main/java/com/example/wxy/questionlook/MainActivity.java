package com.example.wxy.questionlook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Chinese_button = (Button) findViewById(R.id.buttonChinese);
        Button Math_button = (Button) findViewById(R.id.buttonMath);
        Button English_button = (Button) findViewById(R.id.buttonEnglish);
        Button Physics_button = (Button) findViewById(R.id.buttonPhysics);
        Button  Chemistry_button = (Button) findViewById(R.id.buttonChemistry);

        Chinese_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Chinese.class);
                startActivity(intent);
            }
        });
        Math_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Math.class);
                startActivity(intent);
            }
        });
        English_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, English.class);
                startActivity(intent);
            }
        });
        Physics_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Physics.class);
                startActivity(intent);
            }
        });
        Chemistry_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Chemistry.class);
                startActivity(intent);
            }
        });

    }
}

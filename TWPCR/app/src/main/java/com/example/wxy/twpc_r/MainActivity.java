package com.example.wxy.twpc_r;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.buttonRun);
        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText1.length() == 0 && editText2.length()==0) {
                    Toast.makeText(MainActivity.this, "请输入分数",
                            Toast.LENGTH_SHORT).show();
                } else if (editText1.length() == 0) {
                    Toast.makeText(MainActivity.this, "请输入分子",
                            Toast.LENGTH_SHORT).show();
                } else if (editText2.length() == 0) {
                    Toast.makeText(MainActivity.this, "请输入分母",
                            Toast.LENGTH_SHORT).show();
                } else {
                    String inputText1 = editText1.getText().toString();
                    String inputText2 = editText2.getText().toString();
                    Log.d("inputText1", inputText1);
                    Log.d("inputText2", inputText2);
                    int ans = gcd(Integer.parseInt(inputText1), Integer.parseInt(inputText2));
                    String ans1 = String.valueOf(Integer.parseInt(inputText1) / ans);
                    String ans2 = String.valueOf(Integer.parseInt(inputText2) / ans);
                    String output = "";
                    if (ans2.equals("1")) output = "输出:" + ans1;
                    else output = "输出:" + ans1 + "/" + ans2;
                    textView.setText(output);
                }
            }
        });
    }
    public int gcd(int m, int n) {
        int rem;
        while(n > 0) {
            rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }
}

package com.example.a3butons;

import static com.example.a3butons.R.id.button1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private   TextView textView;
    private Button button1;
    private Button button2;
    private Button button3;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("натиснута кнопка 1");

            }
        });
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        textView.setText("натиснута кнопка 2");
    }
    public void clickButton3(View view){
     textView.setText("натиснута кнопка 3");

    }
}
package com.example.intentsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public abstract class ScondActivity extends AppCompatActivity {
    String val1;
    String val2;
    double answer;

    //create objects to set values
    EditText num1;
    EditText num2;
    TextView ans;

    Button add;
    Button subs;


    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_scond);


    //set objects references
    num1 = findViewById(R.id.editText7);
    num2 = findViewById(R.id.editText8);
    add = findViewById(R.id.button2);
    ans = findViewById(R.id.editText9);
    subs = findViewById(R.id.button3);

    Intent recive = getIntent();

    //get values to variable
    val1 = recive.getStringExtra("num1");
    val2 = recive.getStringExtra("num2");

    //set values to the objects
        num1.setText(val1);
        num2.setText(val2);

        add.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            answer = Double.parseDouble(val1) + Double.parseDouble(val2);

            ans.setText(Double.toString(answer));

        }
    });

        subs.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            answer = Double.parseDouble(val1) - Double.parseDouble(val2);

            ans.setText(Double.toString(answer));
        }
    });

     }
}


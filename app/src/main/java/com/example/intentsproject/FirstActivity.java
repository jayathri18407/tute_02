package com.example.intentsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button OK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        num1 = findViewById(R.id.editText3);
        num2 = findViewById(R.id.editText4);
        OK = findViewById(R.id.button);

        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FirstActivity.this,ScondActivity.class);
                intent.putExtra("num1",num1.getText().toString());
                intent.putExtra("num2",num2.getText().toString());

                startActivity(intent);
             }

    });
    }
}

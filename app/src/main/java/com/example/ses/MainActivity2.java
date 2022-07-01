package com.example.ses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button button1 = (Button) findViewById(R.id.zad);
        Button button2 = (Button) findViewById(R.id.reg);

        EditText text1 = (EditText) findViewById(R.id.txt1);
        EditText text2 = (EditText) findViewById(R.id.txt2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1.getText().toString().equals("") || text2.getText().toString().equals("")){
                    Toast.makeText(MainActivity2.this,"не верный логин или пароль",Toast.LENGTH_LONG).show();
                }
                else {
                    Intent i = new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
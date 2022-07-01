package com.example.ses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.ent);
        Button button2 = (Button) findViewById(R.id.reg);
        Button button3 = (Button) findViewById(R.id.clin);

        EditText text1 = (EditText) findViewById(R.id.log);
        EditText text2 = (EditText) findViewById(R.id.pas);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.getText().clear();
                text2.getText().clear();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
    }
}
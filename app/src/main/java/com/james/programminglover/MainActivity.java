package com.james.programminglover;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView javabtn, pythonbtn, cbtn,sqlbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        javabtn=findViewById(R.id.java_cv);
        pythonbtn=findViewById(R.id.python_cv);
        cbtn=findViewById(R.id.c_cv);
        sqlbtn=findViewById(R.id.sql_cv);


        javabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,JavaActivity.class);
                startActivity(intent);
            }
        });
        pythonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,PythonActivity.class);
                startActivity(intent);
            }
        });
        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,CActivity.class);
                startActivity(intent);
            }
        });
        sqlbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,SqlActivity.class);
                startActivity(intent);
            }
        });

    }
}
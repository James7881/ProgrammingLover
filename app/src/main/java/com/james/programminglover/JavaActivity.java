package com.james.programminglover;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JavaActivity extends AppCompatActivity {

    ListView listView;

    String[] language ={"Hello Java Program", "Java Variables", "Java Data Types", "Operators", "Keywords", "If-Else",
            "Java Switch", "Java Loops", "Java Break & Continue", "Object and Class", "Method", "Constructor",
            "Static & this keyword", "Java Inheritance", "Java Polymorphism", "Java Abstraction", "Java Encapsulation", "Java Array"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        listView=findViewById(R.id.listview);
        ArrayAdapter<String> adp= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, language);
        listView.setAdapter(adp);

    }
}
package com.james.programminglover;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PythonActivity extends AppCompatActivity {

    ListView listView;

    String[] python_topics ={"Python Intro", "Python Syntax", "Variables", "Data Types", "Numbers", "Casting",
            "Strings", "Booleans", "Operators", "Lists & Tuples", "Sets & Dictionaries", "If-Else",
            "For & While Loops", "Functions", "Lambda", "Arrays", "Class/Objects", "Inheritance",
            "Iterators", "Scope", "Modules", "Python JSON", "Try Except", "File Handing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

        listView = findViewById(R.id.listview_python);
        ArrayAdapter<String> adp= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, python_topics);
        listView.setAdapter(adp);
    }
}
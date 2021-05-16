package com.james.programminglover;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CActivity extends AppCompatActivity {

    ListView listView;

    String[] c_topics={"C Intro", "Printf() & scanf()", "Variables", "Data Types", "Keywords", "Identifiers",
            "operators", "Booleans", "If-Else", "Switch", "Loops", "Nested Loops",
            "Break & Continue", "Goto", "Function", "Recursion", "Array(1-D, 2-D)", "Pointers",
            "Strings", "Structure", "File Handling"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        listView=findViewById(R.id.listview_c);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, c_topics);
        listView.setAdapter(adp);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(CActivity.this, CIntroActivity.class);
                intent.putExtra("key_position",i);
                startActivity(intent);

            }
        });

    }
}
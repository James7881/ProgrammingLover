package com.james.programminglover;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SqlActivity extends AppCompatActivity {
    ListView listView;
    String[] sql_topics={"Coming Soon......"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);

        listView=findViewById(R.id.listview_sql);
        ArrayAdapter<String> adp= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,sql_topics);
        listView.setAdapter(adp);
    }
}
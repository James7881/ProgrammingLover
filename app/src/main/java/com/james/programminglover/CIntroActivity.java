package com.james.programminglover;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CIntroActivity extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_intro);

        pdfView=findViewById(R.id.pdfView);

        int c_position = getIntent().getIntExtra("key_position",0);
        if (c_position==0){
            pdfView.fromAsset("c_intro.pdf").load();
        }
    }
}
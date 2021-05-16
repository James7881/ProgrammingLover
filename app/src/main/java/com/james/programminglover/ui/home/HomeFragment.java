package com.james.programminglover.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.james.programminglover.CActivity;
import com.james.programminglover.JavaActivity;
import com.james.programminglover.PythonActivity;
import com.james.programminglover.R;
import com.james.programminglover.SqlActivity;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final LinearLayout textView = root.findViewById(R.id.linear_layout_main);

        CardView java_cv = root.findViewById(R.id.java_cv);
        CardView python_cv = root.findViewById(R.id.python_cv);
        CardView c_cv = root.findViewById(R.id.c_cv);
        CardView sql_cv = root.findViewById(R.id.sql_cv);

        java_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity(new Intent(getActivity(),JavaActivity.class));
            }
        });

        python_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), PythonActivity.class));
            }
        });

        c_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), CActivity.class));
            }
        });

        sql_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SqlActivity.class));
            }
        });

        return root;
    }
}
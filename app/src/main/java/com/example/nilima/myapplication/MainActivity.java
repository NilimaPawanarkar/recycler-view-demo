package com.example.nilima.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {

        Context context;
        RecyclerView recyclerView;
        RelativeLayout relativeLayout;
        RecyclerView.Adapter recyclerViewAdapter;
        RecyclerView.LayoutManager recylerViewLayoutManager;
        String[] subjects =
                {
                        "ANDROID",
                        "PHP",
                        ".net",
                        "ASP.NET",
                        "JAVA",
                        "C++",
                        "MATHS",
                        "HINDI",
                        "ENGLISH"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_ACTION_BAR);

            setContentView(R.layout.activity_main);

            context = getApplicationContext();

            relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout1);

            recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);

            recylerViewLayoutManager = new LinearLayoutManager(context);

            recyclerView.setLayoutManager(recylerViewLayoutManager);

            recyclerViewAdapter = new RecyclerViewAdapter(context, subjects);

            recyclerView.setAdapter(recyclerViewAdapter);
        }
    }

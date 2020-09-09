package com.example.kiddos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class LevelActivity extends AppCompatActivity {

    RecyclerView recycler_view_trainLevel;
    List<LevelModelClass> levelModelClasses;
    LevelAdapter levelAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        if(getSupportActionBar()!=null)
            getSupportActionBar().hide();



        setContentView(R.layout.activity_level);

       /* ArrayList<LevelModelClass>levelModelClasses = new ArrayList<>();
        levelModelClasses.add(new LevelModelClass("A"));*/

        levelModelClasses = new ArrayList<>();
        levelModelClasses.add(new LevelModelClass("A"));





        recycler_view_trainLevel=findViewById(R.id.trainLevel);
       // levelModelClasses = new ArrayList<>();
       // levelAdapter = new levelAdapter(levelModelClasses, LevelActivity.this);
        levelAdapter = new LevelAdapter(levelModelClasses, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(LevelActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recycler_view_trainLevel.setLayoutManager(mLayoutManager);
        recycler_view_trainLevel.setAdapter(levelAdapter);

       // prepareLevelData();



    }

   /* private void prepareLevelData() {

        LevelModelClass levelModelClass = new LevelModelClass("A");
        levelModelClasses.add(levelModelClass);

    }*/
}
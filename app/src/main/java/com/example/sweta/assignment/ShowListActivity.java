package com.example.sweta.assignment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sweta.assignment.MyViewRecycler.MyAdapter;
import com.example.sweta.assignment.Realm.MyPojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sweta on 3/17/18.
 */

public class ShowListActivity extends AppCompatActivity {


    private RecyclerView myRecycleView;
    private MyAdapter myAdapter;
    private List<MyPojo> myPojoList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);

        initViews();
        initRecyclerView();
    }

    private void initViews(){
        myRecycleView=findViewById(R.id.recyclerView);
    }

    private void initRecyclerView(){


        myRecycleView.setLayoutManager(new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false));

        myPojoList =


        myAdapter = new MyAdapter(myPojoList);
        myRecycleView.setAdapter(myAdapter);
    }
}

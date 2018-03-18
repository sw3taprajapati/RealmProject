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

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by sweta on 3/17/18.
 */

public class ShowListActivity extends AppCompatActivity {


    private RecyclerView myRecycleView;
    private MyAdapter myAdapter;
    private List<MyPojo> myPojoList;
    private RealmResults<MyPojo> myPojoRealmResults;
    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_list);

        initViews();
        initRecyclerView();
        setDataToAdapter();
    }

    private void initViews() {
        myRecycleView = findViewById(R.id.recyclerView);
    }

    private void initRecyclerView() {
        myRecycleView.setLayoutManager(new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false));

        myPojoList = new ArrayList<>();

        myAdapter = new MyAdapter(myPojoList);
        myRecycleView.setAdapter(myAdapter);
    }

    private void setDataToAdapter() {
        realm = Realm.getDefaultInstance();

        myPojoRealmResults = realm.where(MyPojo.class).findAll();

        myPojoList = realm.copyFromRealm(myPojoRealmResults);

        realm.close();
        myAdapter.notifyDataSetChanged();
    }
}

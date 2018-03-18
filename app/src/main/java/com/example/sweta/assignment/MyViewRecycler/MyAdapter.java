package com.example.sweta.assignment.MyViewRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sweta.assignment.R;
import com.example.sweta.assignment.Realm.MyPojo;

import java.util.List;

/**
 * Created by sweta on 3/16/18.
 */

//MyAdapter extends RecyclerView.Adapter<MyViewHolder>
    //where MyViewHolder is our custom ViewHolder
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    List<MyPojo> myPojos;
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_my_recyclerview, parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


        MyPojo myPojo=myPojos.get(position);
        holder.myName.setText(myPojo.getName());
        holder.myRollNo.setText(myPojo.getRoll().toString());
    }

    @Override
    public int getItemCount() {
        return myPojos.size();
    }
}

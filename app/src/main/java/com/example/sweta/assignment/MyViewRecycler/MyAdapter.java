package com.example.sweta.assignment.MyViewRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by sweta on 3/16/18.
 */

//MyAdapter extends RecyclerView.Adapter<MyViewHolder>
    //where MyViewHolder is our custom ViewHolder
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

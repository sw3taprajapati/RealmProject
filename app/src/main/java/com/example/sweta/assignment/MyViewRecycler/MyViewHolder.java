package com.example.sweta.assignment.MyViewRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.sweta.assignment.R;

/**
 * Created by sweta on 3/16/18.
 */

public class MyViewHolder extends ViewHolder {

    protected TextView myName,myRollNo;

    public MyViewHolder(View itemView) {
        super(itemView);

        initViews();
    }

    private void initViews(){

        myName=itemView.findViewById(R.id.name);
        myRollNo=itemView.findViewById(R.id.roll);
    }
}

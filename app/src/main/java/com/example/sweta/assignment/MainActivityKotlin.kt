package com.example.sweta.assignment

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/**
 * Created by sweta on 3/16/18.
 */
class MainActivityKotlin : AppCompatActivity(), View.OnClickListener {


    private lateinit var nameField:EditText
    private lateinit var rollField:EditText
    private lateinit var saveBtn:Button
    private lateinit var showList:TextView
    private lateinit var nameText:String
    private lateinit var rollText:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener(){

        nameField.setOnClickListener(this)
        rollField.setOnClickListener(this)
        saveBtn.setOnClickListener(this)
        showList.setOnClickListener(this)
    }

    override fun onClick(view: View?) {

        if(view==nameField){
        }
    }
}
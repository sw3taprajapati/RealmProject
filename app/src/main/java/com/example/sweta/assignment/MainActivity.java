package com.example.sweta.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sweta.assignment.Realm.MyPojo;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by sweta on 3/16/18.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameText;
    private EditText rollText;
    private Button btnSave;
    private TextView showList;
    private String nameString;
    private Integer roll;
    MyPojo myPojo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        setListeners();
    }

    private void initComponents(){
        nameText=findViewById(R.id.nameField);
        rollText=findViewById(R.id.rollField);
        btnSave=findViewById(R.id.saveBtn);
        showList=findViewById(R.id.viewList);
    }

    private void setListeners(){
        nameText.setOnClickListener(this);
        rollText.setOnClickListener(this);
        btnSave.setOnClickListener(this);
        showList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view==btnSave){
            nameString=nameText.getText().toString().trim();

            if(nameString.equalsIgnoreCase("")){
                Toast.makeText(this,"Please Enter the name",Toast.LENGTH_LONG).show();
            }else{
                roll=Integer.parseInt(String.valueOf(rollText.getText()));

                if(roll==null){
                    Toast.makeText(this,"Please Enter the roll",Toast.LENGTH_LONG).show();
                }else{
                    myPojo=new MyPojo(nameString, roll);
                    initRealm();

                }
            }
        }else if(view==showList){
            Intent intent=new Intent(MainActivity.this,ShowListActivity.class);
        }

    }

    private void initRealm(){
        Realm realm= Realm.getDefaultInstance();

        realm.beginTransaction();

        realm.copyToRealmOrUpdate(myPojo);

        realm.commitTransaction();

        realm.close();
    }
}

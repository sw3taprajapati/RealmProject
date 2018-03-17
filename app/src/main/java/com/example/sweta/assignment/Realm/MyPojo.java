package com.example.sweta.assignment.Realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by sweta on 3/16/18.
 */

public class MyPojo extends RealmObject {

    private String name;

    @PrimaryKey
    private Integer roll;

    //default constructor needed if class has constructor with parameters
    public MyPojo() {
    }

    public MyPojo(String name, Integer roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }
}

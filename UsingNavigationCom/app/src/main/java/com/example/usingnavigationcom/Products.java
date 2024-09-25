package com.example.usingnavigationcom;

import java.io.Serializable;

public class Products implements Serializable {
    private  int id;

    public Products(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    public Products() {
    }
}

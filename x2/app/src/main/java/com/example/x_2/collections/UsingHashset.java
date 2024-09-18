package com.example.x_2.collections;

import java.sql.SQLOutput;
import java.util.HashSet;

public class UsingHashset {
    public static void main(String[] args) {
        //
        HashSet<String> fruits=new HashSet<>();
        //ADD Data
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");

        System.out.println(fruits);

        System.out.println("Size: "+fruits.size());
        System.out.println("IsEmpty:"+fruits.isEmpty());

        for (String f:fruits){
            System.out.println("Fruits: "+f);
        }

    }
}

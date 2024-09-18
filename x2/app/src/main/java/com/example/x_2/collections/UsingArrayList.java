package com.example.x_2.collections;

import java.util.ArrayList;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();

        //adding values

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Strawberry");
        System.out.println(fruits);

        //update
        fruits.set(1,"New Banana");
        System.out.println(fruits);

        //ınsert
        fruits.add(1,"Orange");
        System.out.println(fruits);

        //read data
        String fruit=fruits.get(3);
        System.out.println(fruit);

        System.out.println("Size : "+fruits.size());
        System.out.println("ıs Empty : "+fruits.isEmpty());

        for (String f:fruits) {
            System.out.println("Sonuç: "+f);
        }
        for (int i=0;i<fruits.size();i++){
            System.out.println(i+". ->"+fruits.get(i));
        }

        fruits.remove(2);
        System.out.println(fruits);

        fruits.clear();
        System.out.println(fruits);
    }
}

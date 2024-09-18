package com.example.x_2.collections;

import java.util.HashMap;
import java.util.Set;

public class UsingHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> cities=new HashMap<>();

        //Add Data

        cities.put(16,"Bursa");
        cities.put(34,"Istanbul");
        System.out.println(cities);

        //update
        cities.put(16,"New Bursa");
        System.out.println(cities);

        //read data

        String city=cities.get(34);
        System.out.println("Result: "+city);

        System.out.println("Size"+cities.size());
        System.out.println("isEmpty"+cities.isEmpty());

        Set<Integer> keys=cities.keySet();

        for (Integer k:keys){
            System.out.println("Results:"+cities.get(k));
        }

        cities.remove(34);
        System.out.println(cities);

        cities.clear();
        System.out.println(cities);
    }




}

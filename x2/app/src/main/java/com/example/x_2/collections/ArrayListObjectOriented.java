package com.example.x_2.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListObjectOriented {
    public static void main(String[] args) {


    Products u1=new Products(1,"Phone",23000);
    Products u2=new Products(2,"Laptop",1000);
    Products u3=new Products(3,"VacumCleaner",13000);

    ArrayList<Products> productsList=new ArrayList<>();
    productsList.add(u1);
    productsList.add(u2);
    productsList.add(u3);

        for (Products p:productsList ){
        System.out.println("Id: "+p.getId()+" - Name:"+p.getName()+" - Price: "+p.getPrice());
         }
        System.out.println("-------Price LowtoUpper---------");
        Collections.sort(productsList,new Siralama());
        for (Products p:productsList ){
            System.out.println("Id: "+p.getId()+" - Name:"+p.getName()+" - Price: "+p.getPrice());
        }

        System.out.println("-------Price UppertoLow---------");
        Collections.sort(productsList,new Siralama ());
        for (Products p:productsList ){
            System.out.println("Id: "+p.getId()+" - Name:"+p.getName()+" - Price: "+p.getPrice());
        }

        System.out.println("-------Name UppertoLow---------");
        Collections.sort(productsList,new Siralama2());
        for (Products p:productsList ){
            System.out.println("Id: "+p.getId()+" - Name:"+p.getName()+" - Price: "+p.getPrice());
        }
    }
    public static class Siralama implements Comparator<Products>{

        @Override
        public int compare(Products t1 , Products products) {

            return new Integer(products.getPrice()).compareTo(t1.getPrice());
        }
    }

    public static class Siralama2 implements Comparator<Products>{

        @Override
        public int compare(Products t1 , Products products) {

            return t1.getName().compareTo(products.getName());
        }
    }
}

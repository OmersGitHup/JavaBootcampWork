package com.example.bootcampjava_1;

public class MainOperations {
    public static void main(String[] args) {
        Counter c=new Counter();
        Conversion convert=new Conversion();
      //  c.sumInteriorAngleCounter(3);

        int salary=c.salaryCounter(30);
        System.out.println(salary);

        int cost=c.parkingCost(10);
        System.out.println(cost);

        double kmtoMile=convert.convertKmtoMile(10);
        System.out.println(kmtoMile);

        c.rectangleAreaCounter(1,10);
    }
}

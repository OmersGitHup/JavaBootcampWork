package com.example.bootcampjava_1;

public class Counter {

    public void sumInteriorAngleCounter(int sidecount){
        int sumInteriorAngles=((sidecount-2)*180);
        System.out.println(sumInteriorAngles);
    }
    public int salaryCounter(int day){
        int salary;
        int totalHour=day*8;
        if (totalHour<=150){
             salary=totalHour*40;
        }else if (totalHour>150){
            int extra=80*(totalHour-150);
            int regular=40*(150);
             salary=extra+regular;
        }else  {
             salary=0;

        }
        return salary;
    }

    public int parkingCost(int stayedHour){
        int cost ;
        if (stayedHour<1){
            cost=0;
        }else if(stayedHour>=1){
            cost=50+10*(stayedHour-1);
        }else {
            cost=0;
        }
        return cost;
    }

    public void rectangleAreaCounter(int lowSide,int longSide){
       int x= longSide*lowSide;
        System.out.println(x);
    }

    public int factoriel()



}

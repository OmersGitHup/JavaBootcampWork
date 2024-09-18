package com.example.x_2.inheritance;

public class UsingInheritence
{
    public static void main(String[] args) {
        Palace topkapiPalace=new Palace();
        topkapiPalace.setTowerCount(3);
        topkapiPalace.setWindowCount(3);
        System.out.println(topkapiPalace.getTowerCount());
        System.out.println(topkapiPalace.getWindowCount());

        Villa bogazVilla=new Villa();
        bogazVilla.setPark(true);
        bogazVilla.setWindowCount(3);
        System.out.println(bogazVilla.isPark());
        System.out.println(bogazVilla.getWindowCount());

        //Type casting

        //upcasting - downcasting

        if (topkapiPalace instanceof  Palace){
            System.out.println("Itispalace");
        }else {
            System.out.println("ItisNotPalace");
        }

//        //upcasting
//        Palace palace=new Palace();
//        Home home=palace;
//
//        //downcasting
//        Home homex=new Home();
//        Palace newPalace=(Palace) homex;

    }
}

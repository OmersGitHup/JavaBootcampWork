package com.example.x_2;

public class UsingEnum {
    public static void main(String[] args) {
        getCost(CanDimension.LOW,100);
    }
    public static void getCost(CanDimension dimension,int piece){
        switch (dimension){
            case LOW:
                System.out.println("Price ="+(piece*24)+"₺");
                break;
            case MIDDLE:
                System.out.println("Price ="+(piece*30)+"₺");
                break;
            case LARGE:
                System.out.println("Price ="+(piece*24)+"₺");
                break;
        }


    }
}

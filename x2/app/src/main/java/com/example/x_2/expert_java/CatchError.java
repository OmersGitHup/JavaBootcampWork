package com.example.x_2.expert_java;

public class CatchError {
    public static void main(String[] args) {
        //Compile error
        String message="Hi";
        //message=100;

        //runtime error

        int x=10;
        int y=0;

        try {
            System.out.println("Result:"+(x/y));
            System.out.println("Solved");
        }catch (Exception e){
            System.out.println("The number cant be 0");
        }
    }
}

package com.example.x_2.using_interface;

public class MyClass implements MyInterface{
    @Override
    public void method1() {
        System.out.println("Method 1 worked");

    }

    @Override
    public String method2() {
        return "Method 2 worked";
    }
}

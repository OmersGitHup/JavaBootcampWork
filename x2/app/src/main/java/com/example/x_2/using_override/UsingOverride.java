package com.example.x_2.using_override;

public class UsingOverride {
    public static void main(String[] args) {
        Animals animals=new Animals();
        Mammals mammals=new Mammals();
        Cat cat =new Cat();
        Dog dog=new Dog();

        animals.rough();
        mammals.rough();
        cat.rough();
        dog.rough();
    }
}

package com.liaobu;

public class Dog extends Animail {
    public String color="red";
    @Override
    public void eat(){
        super.eat();
        System.out.println("dog eat meat");
    }
}

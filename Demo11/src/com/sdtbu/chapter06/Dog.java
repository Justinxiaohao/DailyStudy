package com.sdtbu.chapter06;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}

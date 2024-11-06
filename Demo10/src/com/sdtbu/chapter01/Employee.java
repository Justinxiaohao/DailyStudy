package com.sdtbu.chapter01;

public class Employee {
    String name;
    int age;
    public void work(){
        System.out.println("员工在办公");
        eat();
    }
   private void eat(){
        System.out.println("员工在吃饭");
    }
}

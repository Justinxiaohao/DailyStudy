package com.sdtbu.chapter02;

import com.sdtbu.chapter01.Student;

public class Person {
    String name;
    int age;
    static String country;
    public void eat(){
        System.out.println("吃东西");
        System.out.println(country);
    }
    public static void sleep(){
        System.out.println("睡觉");
    }


}

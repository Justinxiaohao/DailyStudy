package com.sdtbu.chapter01;
//第一章 封装
public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
       // p.name = "张三";
       // p.age = 18;
        //System.out.println(p.name + " " +p.age);
        p.setAge(20);
        p.setName("张三");
        System.out.println(p.getName() + " " +p.getAge());
    }
}

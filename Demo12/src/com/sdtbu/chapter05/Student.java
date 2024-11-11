package com.sdtbu.chapter05;

public class Student {
    String name="张三";
    class Inner{
        String name="李四";
        public void print(String name){
            System.out.println(name);//内部类局部变量
            System.out.println(this.name);//内部类成员变量
            System.out.println(Student.this.name);//外部类成员变量
        }
    }
}

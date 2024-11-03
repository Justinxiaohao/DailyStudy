package com.sdtbu.chapter02;

import com.sdtbu.chapter01.Student;

public class Test01 {
    //1.静态方法中调用非静态方法
    public static void main(String[] args) {
        //静态成员中的方法不能直接访问非静态成员，需要先创建对象
        Person person = new Person();
        //method3();//非静态的成员属于对象
        Test01 test01 = new Test01();
        test01.method3();
        //2.非静态方法中调用静态方法
        //类中：直接用 类外：类点调用
        Person.sleep();
        method2();
        //3.静态方法中调用静态方法
        //类中：直接用 类外：类点调用
        method1();
        Person.sleep();
        //4.非静态方法中调用非静态方法
        //类中：直接用 类外：new对象
        test01.method3();
        Person person1 = new Person();



    }
    public static void method1(){
    }
    public static void method2(){
    }
    public void method3(){
        System.out.println("我是方法三");
    }
    public void method4(){
        method3();
        System.out.println("我是方法四");
    }

}

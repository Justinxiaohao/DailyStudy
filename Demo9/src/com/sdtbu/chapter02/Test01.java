package com.sdtbu.chapter02;

import com.sdtbu.chapter01.Student;

public class Test01 {
    public static void main(String[] args) {
        //静态成员中的方法不能直接访问非静态成员，需要先创建对象
        Person person = new Person();
        //method3();//非静态的成员属于对象
        Test01 test01 = new Test01();
        test01.method3();



    }
    public static void method1(){
    }
    public static void method2(){
    }
    public void method3(){
    }

}

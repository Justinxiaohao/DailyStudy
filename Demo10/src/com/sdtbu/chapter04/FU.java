package com.sdtbu.chapter04;

public class FU {
    int num = 10;
    public FU(){
        System.out.println("我是父类中的无参构造");
    }

    public FU(int data){
        System.out.println("我是父类中的有参构造");
    }

    public void method(){
        System.out.println("我是父类中的method方法");
    }
}
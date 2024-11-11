package com.sdtbu.chapter01;
//final和abstract不能被同一个方法修饰
public abstract class Animal{
    public final void run(){
        System.out.println("动物会走路");
    }
    //public abstract final void eat();
}

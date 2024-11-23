package com.sdtbu.chapter04;

public class Exception02 extends Exception01 {
    @Override
    public void method() throws NullPointerException{
        System.out.println("子类方法");
    }
}

package com.sdtbu.chapter03;

public class InterfaceImpl implements InterfaceA, InterfaceB{
    @Override
    public void test() {
        System.out.println("我是重写的测试方法");

    }

    @Override
    public void test(int a) {

    }
}

package com.sdtbu.chapter03;

public class Test {
    public static void main(String[] args) {
        InterClass.Inner inner = new InterClass.Inner();
        inner.setAge(10);
        inner.setName("sdtbu");
        System.out.println(inner.getAge() + "========= " + inner.getName());
        //inner.test();//静态内部类不能调用外部的非静态成员
    }
}

package com.sdtbu.chapter01;

public class Test/* extends Modifers*/ {
//不能被继承

    public static void main(String[] args) {
        final int a = 1;
        //a=2;//不能修改final修饰的局部变量

        final Person p = new Person("张三", 20);
        p.setAge(30);
        p.setName("李四");
        System.out.println(p);
        //p=new Person("王五", 40);
        //地址值不能改变但是属性值可以改变
        System.out.println(p.getAge()+p.getName());



    }
}

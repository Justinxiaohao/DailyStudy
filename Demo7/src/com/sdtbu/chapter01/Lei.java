package com.sdtbu.chapter01;
//实体类：一类事物的抽象表现形式
//组成成分：
// 1.属性（成员变量）
//  a.定义位置： 类中方法外
//  b.作用范围：类中 也可以理解为全局变量 定义在方法内的是局部变量 且必须要初始化值
//
// 2.行为（方法）

public class Lei {
    String name;
    int age;
    public void eat(){
        System.out.println("吃东西");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}

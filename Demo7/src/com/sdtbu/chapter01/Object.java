package com.sdtbu.chapter01;
//1.什么是对象？       类是一类事物的抽象
//一类事物的具体体现    抽象的人类
//new 一个对象就是转化为一个具体的人
//b:创建对象  想使用哪一个类里面的成员就new什么
//类名 对象名= new 类名();
//c:调用成员（成员变量，成员方法）就用那个类的对象去点哪个成员
// 对象名.成员变量名=值
//对象名.方法名();
public class Object {
    public static void main(String[] args) {
        Lei lei = new Lei();
        lei.eat();
        lei.sleep();
    }
}

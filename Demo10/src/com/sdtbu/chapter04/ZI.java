package com.sdtbu.chapter04;
//1.注意:new子类对象时,会先初始化父类(先走父类无参构造方法)
//2.原因: 每个构造方法的第一行,默认都会有一个super(),不写jvm自动提供一个
//  super()代表的是父类无参构造

//1.概述:代表的是父类引用 2.作用:可以调用父类中的成员
//3.使用:
//  a.调用父类构造方法-> 在子类中的构造中写
//    super() -> 调用父类无参构造
//    super(实参)  -> 调用父类有参构造
//  b.调用父类成员变量:
//    super.成员变量名
//  c.调用父类成员方法:
//    super.成员方法名(实参)
public class ZI extends FU{
    int num = 100;
    public ZI(){
        super();//调用父类中的无参构造
        System.out.println("我是子类中的无参构造");
    }

    public ZI(int num){
        super(10);//调用父类的有参构造
        System.out.println("我是子类中的有参构造");
    }

    @Override
    public void method(){
        super.method();//调用父类的method方法
        System.out.println("我是子类中的method方法");
        System.out.println(num);//子类自己的
        System.out.println(super.num);//调用父类的num
    }
}
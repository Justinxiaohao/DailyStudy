package com.sdtbu.chapter02;

public class Animal {
    public Animal()
    {
        System.out.println("我是空参构造器");
    }
    {
        System.out.println("我是代码块的测试方法");//优先于构造方法，每new一次对象就会执行一次
    }
    public void run()
    {
        System.out.println("我是run方法");
    }
    static{
        System.out.println("我是静态代码块");//  静态代码块优先于构造代码块和构造方法执行的,而且只执行一次
    }
    //如果想让一些数据最先初始化,而且只需要初始化一次,就可以将这些数据放到静态代码块中
}

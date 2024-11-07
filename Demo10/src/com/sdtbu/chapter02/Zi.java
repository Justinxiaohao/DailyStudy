package com.sdtbu.chapter02;

public class Zi extends Fu {

    public String name="子类";

    public String name1="子类";


    @Override
    public void show(){
        System.out.println("子类方法");
    }
    public void show1(){
        System.out.println("我是子类的SHOW1方法");
    }
    //1.子类重写父类方法之后,权限必须要保证大于等于父类权限(权限指的是访问权限)
    //  public -> protected -> 默认 -> private
    //2.子类方法重写父类方法,方法名和参数列表要一样
    //3.私有方法不能被重写,构造方法不能被重写,静态方法不能被重写
    //4.子类重写父类方法之后,返回值类型应该是父类方法返回值类型的子类类型
    @Override
    public Zi method03(){
        return null;
    }
}

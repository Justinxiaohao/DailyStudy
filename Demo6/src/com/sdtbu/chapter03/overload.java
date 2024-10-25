package com.sdtbu.chapter03;
//方法的重载
//方法名相同，参数列表不同
//参数列表不同：个数不同 类型不同 类型顺序不同
//和参数名和返回值无关
public class overload {
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void sum(double a,int b){
        System.out.println(a+b);
    }
    public static void sum(int a,double b){
        System.out.println(a+b);
    }

}

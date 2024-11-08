package com.sdtbu.chapter01;

public interface USB {
    public abstract void open();
    public abstract void close();
    public static void test(){
        System.out.println("我是测试静态方法");
    }
    public default void test2(){//临时添加功能使用
        System.out.println("我是测试默认方法");
    }
}

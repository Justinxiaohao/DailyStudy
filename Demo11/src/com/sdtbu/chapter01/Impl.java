package com.sdtbu.chapter01;
//接口是一个引用数据类型，是一种标准，准测
//public interface 接口名{
//}
//实现类 implements 接口名{
//}
//接口中可以定义的成员
//1.jdk7以前
//public interface Interface {
//    //1.常量
//    public static final int NUM = 10;
//    //2.抽象方法
//    public abstract void show();//不写默认也有
//}
////2.jdk8
//public interface Interface {
//    1.静态方法
//    public static void show1(){
//        System.out.println("show1");
//}
//    //2.默认方法
//    public default void show2(){
//        System.out.println("show2");
//    }
//}
//3.jdk9
//public interface Interface {
//    //1.私有方法
//    private void show3(){
//        System.out.println("show3");
//    }
//
//}
//4.接口的使用
//(1)实现类实现接口
//(2)重写接口的抽象方法
//(3)创建实现类对象
//(4)调用重写后的方法

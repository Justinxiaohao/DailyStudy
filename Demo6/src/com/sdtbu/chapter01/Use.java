package com.sdtbu.chapter01;
//什么时候使用参数？
//方法A的数据传递给方法B 定义方法B需要有参数  方法A调用方法B时，把A的数据通过参数传递给方法B

//什么时候使用返回值？
//调用方法A时，想要方法A的结果，去参与其他的运算，则方法A需要返回
public class Use {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b);
        sum(10,20);
    }
    public static void method(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
    }
    public static int sum(int x, int y) {
        return x + y;
    }

}

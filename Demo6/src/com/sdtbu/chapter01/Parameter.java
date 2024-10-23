package com.sdtbu.chapter01;

public class Parameter {
    //形参和实参
    public static void main(String[] args) {
        int a = 10;
        int b = 20;//实际参数
        int c = add(a, b);
        System.out.println(c);
    }
    public static int add(int x, int y) { //形式参数
        return x + y;
    }
}

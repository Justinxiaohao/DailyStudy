package com.sdtbu.chapter01;

public class Exercise {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean result =isBigger(a,b);//传递的是变量 变量当作实参来使用 真正的传递的是值，而不是变量本身
        System.out.println(result);


    }
    public static boolean isBigger(int x, int y){
        if(x>y){
            return true;
        }
        return false;
    }

}

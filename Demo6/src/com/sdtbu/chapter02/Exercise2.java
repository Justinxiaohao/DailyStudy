package com.sdtbu.chapter02;

public class Exercise2 {
    public static void main(String[] args) {
        int result = add();
        System.out.println(result);

    }
    public static int add(){
        int sum=0;
        for(int i=1;i<101;i++)
            sum=sum+i;
            return sum;
    }
}

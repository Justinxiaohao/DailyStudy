package com.sdtbu.chapter02;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        String result = isJiou(num);
        System.out.println(result);

    }
    public static String isJiou(int x)
    {
        if(x%2==0){
            return "偶数";
        }
        return "奇数";
    }
}


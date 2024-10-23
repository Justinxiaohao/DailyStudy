package com.sdtbu.chapter02;

import java.util.Scanner;

public class Exercise3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        print(num);

    }
    public static void print(int a){
        for (int i = 0; i < a; i++){
            System.out.println("我是一名优秀的JAVA开发工程师");
        }
    }
}

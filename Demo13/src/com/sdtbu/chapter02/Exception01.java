package com.sdtbu.chapter02;

public class Exception01 {
    public static void main(String[] args) {
        String str = "123";
        method(str);
    }
    public static void method(String str){
        if(str.endsWith("89")){
            System.out.println("字符串以23结尾");
        }else{
            throw new RuntimeException("字符串不以23结尾");
        }
        }

    }


package com.sdtbu.chapter01;

public class Demo03String {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello" + "world";
        String str4 = "helloworld";
        String str5 = str1 + str2;
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);//字面值拼接不会产生新对象，而是直接引用常量池中对象
        //变量值拼接会产生新对象
    }
}

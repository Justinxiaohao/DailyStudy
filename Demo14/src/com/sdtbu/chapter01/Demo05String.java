package com.sdtbu.chapter01;
//String的各个方法
public class Demo05String {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(s1.length());
        String s2 = "world";
        System.out.println(s1.concat(s2));//拼接字符串
        System.out.println(s1.charAt(1));//获取指定索引的字符
        System.out.println(s1.indexOf("lo"));//获取指定字符串在源字符串中第一次出现的位置
        System.out.println(s1.substring(1,3));//获取子串，一个参数是从索引开始到最后
        System.out.println(s1.toUpperCase());//转换为大写
        System.out.println(s1.toLowerCase());//转换为小写

    }
}

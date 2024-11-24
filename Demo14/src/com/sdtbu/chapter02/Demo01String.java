package com.sdtbu.chapter02;

public class Demo01String {
    public static void main(String[] args) {
//    1.判断老串中是否包含指定的串 boolean contains(String s)
//    2.判断老串是否以指定的串结尾 boolean endswith(string s)
//    3.判断老串是否以指定的串开头 boolean start swith(string s)
//    4.toLowerCase()->将字母转成小写
//    5.toUpperCase()->将字母转成大写
//    6.string trim()-> 去掉字符串两端空格
        String s1="  hello  ";

        System.out.println(s1.trim());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.startsWith("h"));
        System.out.println(s1.endsWith("o"));
        System.out.println(s1.contains("ll"));
    }
}

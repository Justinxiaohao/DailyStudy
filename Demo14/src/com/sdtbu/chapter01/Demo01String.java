package com.sdtbu.chapter01;

public class Demo01String {
    public static void main(String[] args) {
        String str1 = "hello";//String str=new String("hello");
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(arr);
        System.out.println(str2);
        byte[] arr3 = {97, 98, 99, 100, 101};
        String str3 = new String(arr3);
        System.out.println(str3);
        char[] arr4 = {'a', 'b', 'c', 'd', 'e'};
        String str4 = new String(arr4, 1, 3);
        System.out.println(str4);
        byte[] arr5 = {97, 98, 99, 100, 101};
        String str5 = new String(arr5, 1, 3);
        System.out.println(str5);


    }
}

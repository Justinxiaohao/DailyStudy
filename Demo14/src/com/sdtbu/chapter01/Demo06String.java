package com.sdtbu.chapter01;

import java.io.UnsupportedEncodingException;

public class Demo06String {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "hello";
        char[] arr1 = s1.toCharArray();
        for (int i = 0; i <arr1.length; i++){
            System.out.println(arr1[i]);
        }
        byte[] arr2 = s1.getBytes();
        for (int i = 0; i <arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println(s1.replace('l', 'w'));
        byte[] arr3=s1.getBytes("utf-8");//将指定字符串转为charset编码的字节数组
    }
}

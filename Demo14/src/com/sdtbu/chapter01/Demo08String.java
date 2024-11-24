package com.sdtbu.chapter01;

public class Demo08String {
    public static void main(String[] args)
    {
        String s1 = "hello.world";
        String[] split = s1.split("\\.");
        for(int i = 0; i < split.length; i++){
            System.out.println(split[i]);
        }

    }
}

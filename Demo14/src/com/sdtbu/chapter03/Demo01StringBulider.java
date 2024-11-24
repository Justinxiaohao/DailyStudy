package com.sdtbu.chapter03;

public class Demo01StringBulider {

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("hello");
        System.out.println(sb1);
        sb.append("hello");
        StringBuilder sb2 = sb.append("world");
        System.out.println(sb2==sb);
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.toString());
    }
}

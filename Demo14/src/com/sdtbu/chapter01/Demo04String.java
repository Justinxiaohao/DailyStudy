package com.sdtbu.chapter01;

import java.util.Objects;

public class Demo04String {
    public static void main(String[] args) {
        String str1=null;
        String str2 = "";
        if ("abd".equals(str2)){
            System.out.println("1111");
        }
        if(method(str1,str2)){
            System.out.println("他们是相等的");

        }

        if(Objects.equals(str1,str2)){
            System.out.println("ok");

        }

    }
    public static boolean method(String s1, String s2){
        //防止空指针
        if(Objects.equals(s1,s2)){
        //if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}

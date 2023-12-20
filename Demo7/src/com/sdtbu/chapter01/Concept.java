package com.sdtbu.chapter01;

import java.util.Scanner;
//在一个类中想使用别的类中的成员时，就使用面向对象的思想编程
//我们只需要找到需要的对象,使用他的功能,至于怎么实现的不用关心
//调用的成员带static关键字，我们不需要用，直接类名.方法()


public class Concept {
    public static void main(String[] args) {
        String data=new Scanner(System.in).next();
        System.out.println(data);
    }
}

package com.sdtbu.chapter02;

import com.sdtbu.chapter01.Phone;

//匿名对象的使用
//不要等号左边的部分
public class AnonymousObject {
    public static void main(String[] args)
    {
        Phone p = new Phone();
        p.call();
        p.sendMessage();
        //匿名对象
        new Phone().call();
        new Phone().sendMessage();
    }
}

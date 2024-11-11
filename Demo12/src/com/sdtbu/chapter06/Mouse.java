package com.sdtbu.chapter06;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("鼠标打开");
    }
}

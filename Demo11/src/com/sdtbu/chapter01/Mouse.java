package com.sdtbu.chapter01;

public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("打开");
    }

    @Override
    public void close() {
        System.out.println("关闭");

    }

}

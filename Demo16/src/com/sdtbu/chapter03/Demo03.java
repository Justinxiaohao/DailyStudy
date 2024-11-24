package com.sdtbu.chapter03;

public class Demo03 extends Thread{


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName()+"执行了第"+i+"次");
        }
    }
}

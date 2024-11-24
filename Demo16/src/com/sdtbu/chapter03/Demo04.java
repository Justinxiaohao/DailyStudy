package com.sdtbu.chapter03;

public class Demo04 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            Thread.yield();//礼让线程，尽量不阻塞线程，但线程调度器有可能忽略
            System.out.println(Thread.currentThread().getName()+"执行了第"+i+"次");
        }
    }
}

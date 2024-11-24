package com.sdtbu.chapter04;

public class Demo01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了第"+i+"次");
            
        }
        
    }
}

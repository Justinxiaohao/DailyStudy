package com.sdtbu.chapter01;
//进程：进入内存中执行的应用程序
//线程：进程的最小执行单元，一个进程可以有多个线程，CPU和内存之间为每一个功能模块分配一个线程，
//并发：同一时刻有多个指令在一个CPU交替运行，例如一个厨师炒三个菜
//并行：多个CPU同时处理多个指令，例如三个厨师同时做菜

public class Demo01 extends Thread{
    public static void main(String[] args) throws InterruptedException {
        Demo01 d1=new Demo01();
        d1.setName("线程1");
        d1.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+"执行了第"+i+"次");
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"执行了第"+i+"次");
        }
    }
}

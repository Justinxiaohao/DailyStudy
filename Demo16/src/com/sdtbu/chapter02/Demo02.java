package com.sdtbu.chapter02;

public class Demo02 extends Thread{
    public static void main(String[] args) {
        Demo02 t = new Demo02();
        Demo02 t1 = new Demo02();

        System.out.println(t.getPriority());
        System.out.println(t1.getPriority());
        t.setPriority(1);
        t1.setPriority(10);
        t.start();
        t1.start();

    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了第"+i+"次");
        }
    }
}

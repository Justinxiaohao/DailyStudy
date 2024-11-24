package com.sdtbu.chapter03;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        Demo03 t = new Demo03();
        Demo04 t1 = new Demo04();
        t.setName("线程1");
        t1.setName("线程2.........");
        t1.join();//抢占线程，插队执行
        //t1.setDaemon(true);//设置为守护线程，当非守护线程结束后，守护线程也会结束
        t.start();
        t1.start();

    }
}

package com.sdtbu.chapter04;
//第二种创建线程的方法
import static java.lang.Thread.currentThread;

public class Test01 {
    public static void main(String[] args)
    {
       Demo01 t=new Demo01();
       /*
       Tread(Runnable target)
       */
       Thread t1=new Thread(t);
       t1.setName("线程1");
       t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(currentThread().getName()+"执行了第"+i+"次");

        }


    }
}

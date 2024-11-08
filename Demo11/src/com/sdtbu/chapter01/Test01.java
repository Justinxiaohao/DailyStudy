package com.sdtbu.chapter01;

public class Test01 {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        m.close();
        m.open();
        m.test2();//默认方法可重写，也可以不重写
        USB.test();

    }
}

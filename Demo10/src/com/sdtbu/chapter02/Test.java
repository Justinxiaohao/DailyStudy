package com.sdtbu.chapter02;

public class Test {
    public static void main(String[] args) {
        Fu f = new Fu();
        System.out.println(f.name);
        f.show();
        //f.show1();
        f.show2();
        Zi z = new Zi();
        System.out.println("==========");
        System.out.println(z.name);
        System.out.println(z.name2);
        System.out.println("==========");
        z.show();
        z.show1();
        z.show2();
        Fu f1 = new Zi();
        System.out.println("==========");
        f1.show();
        System.out.println(f1.name);

    }
}

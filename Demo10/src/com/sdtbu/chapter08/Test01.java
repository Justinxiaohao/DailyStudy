package com.sdtbu.chapter08;

public class Test01 {
    public static void main(String[] args) {
        Network network = new Network();
        network.setName("小豪");
        network.setUid("001");
        network.work();
        Hardware hardware = new Hardware();
        hardware.setName("小明");
        hardware.setUid("002");
        hardware.work();
        JavaEE javaee = new JavaEE();
        javaee.setName("小红");
        javaee.setUid("003");
        javaee.work();
        Android android = new Android();
        android.setName("小刚");
        android.setUid("004");
        android.work();
    }
}

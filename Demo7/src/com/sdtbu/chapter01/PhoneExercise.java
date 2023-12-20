package com.sdtbu.chapter01;

public class PhoneExercise {
    public static void main(String[] args) {

        System.out.println("手机信息如下：");
        Phone phone = new Phone();
        phone.band="华为";
        phone.color="蓝色";
        phone.price=10000;
        phone.CPU="高通";
        phone.call();
        phone.sendMessage();
    }
}


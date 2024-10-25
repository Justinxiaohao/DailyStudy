package com.sdtbu.chapter03;



public class memoryObject {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone);
        System.out.println(phone.band);
        System.out.println(phone.color);
        phone.price=10000;
        phone.band="华为";
        phone.color="蓝色";
        System.out.println(phone.band);
        System.out.println(phone.color);
    }
}

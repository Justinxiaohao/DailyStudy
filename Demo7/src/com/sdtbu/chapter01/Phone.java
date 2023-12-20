package com.sdtbu.chapter01;

public class Phone {
    String band;
    String color;
    int price;
    String CPU;
    public void call(){
        System.out.println(band+color+price+CPU+"的手机可以打电话");
    }
    public void sendMessage(){
        System.out.println(band+color+price+CPU+"的手机可以发短信");
    }
}

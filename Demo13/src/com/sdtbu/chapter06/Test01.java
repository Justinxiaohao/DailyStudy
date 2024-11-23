package com.sdtbu.chapter06;

public class Test01 {
    public static void main(String[] args) {
        Sentence sentence = new Sentence("我是一个句子",0,6);
        System.out.println(sentence);//com.sdtbu.chapter06.Sentence@10f87f48
        System.out.println(sentence.toString());//com.sdtbu.chapter06.Sentence@10f87f48 直接打印对象，会去调用对象的toString方法
        //所以我们需要重写tostring
    }
}

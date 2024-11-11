package com.sdtbu.chapter05;

public class Test01 {
    public static void main(String[] args) {
        Student.Inner inner = new Student().new Inner();
        inner.print("王五");
    }
}

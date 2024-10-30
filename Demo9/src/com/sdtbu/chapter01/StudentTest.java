package com.sdtbu.chapter01;

public class StudentTest {
    public static void main(String[] args) {
        Student.classRoom = "101";
        Student s1 = new Student("张三", 20);
        System.out.println(s1.getName() + " " + s1.getAge()+"在"+Student.classRoom+"教室上课");
        Student s2 = new Student("李四", 30);
        System.out.println(s2.getName() + " " + s2.getAge()+"在"+Student.classRoom+"教室上课");

    }
}

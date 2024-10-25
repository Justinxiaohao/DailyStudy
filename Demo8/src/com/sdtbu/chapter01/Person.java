package com.sdtbu.chapter01;

public class Person  {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(String name){//成员变量和局部变量重名时，优先访问最近的
        System.out.println(this.name+"你好,我是"+name);//哪一个对象调用的方法里面又this.   ,this指的就是哪个对象
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private String name;

    public Person() {
    }

    private int age;

}

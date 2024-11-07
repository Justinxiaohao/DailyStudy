package com.sdtbu.chapter06;

public class Person {
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int age, String address, String name) {
        this.age = age;
        this.address = address;
        this.name = name;
    }

    private String name;

    public Person() {
    }

    private String address;


}

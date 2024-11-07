package com.sdtbu.chapter06;

public class Test01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
        p.setAddress("北京");
        p.setName("张三");
        System.out.println(p.getAge()+" "+p.getAddress()+" "+p.getName());
        Employee e = new Employee(78,"njkb","北京");
        System.out.println(e.getAge()+" "+e.getAddress()+" "+e.getName());

    }
}

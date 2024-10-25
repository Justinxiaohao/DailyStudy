package com.sdtbu.chapter04;

public class Test {
    public static void main(String[] args) {
        Citizen citizen =new Citizen();
        citizen.name="张三";
        citizen.idCard="123456789";
        //citizen.birthday.year=1999; //空指针 citizen.birthday为null MyDate自定义类型 引用数据类型
        // 使用时需要new对象来赋值
        MyDate myDate=new MyDate();
        myDate.year=1999;
        myDate.month=12;
        myDate.day=31;
        System.out.println(citizen.name+":"+citizen.idCard+":"+myDate.year+myDate.month+myDate.day);


    }
}

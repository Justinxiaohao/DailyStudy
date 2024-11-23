package com.sdtbu.chapter07;
//==：运算符：可以用在基本数据类型变量和引用数据类型变量中。
//①如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定类型要相同）
//②如果比较的是引用数据类型变量：比较两个对象的地址值是否相同。（即两个引用是否指向同一实体）
//String、Date、File、包装类等都重写了Object类中的equals（）方法。
// 重写以后，比较的不是两个引用的地址是否相同，而是比较两个对象的“实体内容”（即属性）是否相同。

public class Test01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1=new Person("张三", 20);
        Person person2=new Person("张三", 20);
        System.out.println(person1);//默认去调用Person的toString方法(没有重写所以打印地址)
        System.out.println(person1.equals(person2));
        System.out.println(person1==person2);
        Person person3 = person1;
        System.out.println(person1==person3);
        System.out.println(person1.equals(person3));
        System.out.println("================");
        String s=new String("abc");
        String s2=new String("abc");
        System.out.println(s);//默认去调用String的toString方法(已经重写了所以打印字符串的内容)
        System.out.println(s==s2);
        System.out.println(s.equals(s2));
        System.out.println("=============================");
        String str1="abc";
        String str2="abc";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));//String类重写了equals方法，用于判断两字符串是否相等
        System.out.println("=============================");
        Object object=person2.clone();
        Person person4=(Person)object;
        System.out.println(person4==person2);
        System.out.println(person4.equals(person2));



    }
}

package com.sdtbu.chapter04;
//1.多态的优点
//原式new两边相同，姐可以调用重新给的，父类非私有的，自己特有的

public class Duotai_Advantage {
    public static void main(String[] args)
    {
        Animal a = new Cat();
        test(a);
        Animal b = new Dog();
        test(b);
        System.out.println("==========================");
        //不使用多态
        Cat c = new Cat();
        method(c);
        Dog d = new Dog();
        method(d);

    }
    public static void test(Animal a)//animal a=cat  dog
    {
        a.eat();
    }


    //不使用多态扩展性变差
    public static void method(Cat a)
    {
        a.eat();
    }
    public static void method(Dog a)
    {
        a.eat();
    }
}

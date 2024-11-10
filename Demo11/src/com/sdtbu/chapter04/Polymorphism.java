package com.sdtbu.chapter04;
//多态
//必须有子父类或者接口实现关系
//必须有方法的重写
//Fu fu=new Zi();
//理解为大类型接受了一个小类型的数据
//但是多态下不能使用子类特有的方法

public class Polymorphism {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.eat();
         dog.lookHome();
         Cat cat=new Cat();
         cat.eat();
         cat.catchMouse();
         Animal animal=new Cat();
         animal.eat();//接收子类对象猫，调用猫的方法





    }

}

package com.sdtbu.chapter05;
//多态中的向上转型和向下转型
//1.向上转型：父类引用指向子类对象
//表现形式：父类类型 变量名 = new 子类类型();
//2.向下转型：子类引用指向父类对象
//表现形式 ：子类类型 变量名 = (子类类型) 父类类型的变量名;
//注意 ：向上转型和向下转型都是引用类型之间的转换，但是向上转型是隐式转换，向下转型是显示转换。
//注意 ：向下转型必须先向上转型，否则会出现类型转换异常。

import com.sdtbu.chapter04.Dog;
import com.sdtbu.chapter04.Animal;

public class Up {
    public static void main(String[] args) {
        Animal a = new Dog();  //向上转型
        Dog dog=(Dog)a;        //向下转型
        dog.eat();
        dog.lookHome();
        //a.lookHome();//编译错误，不能调用子类特有的方法
        //a.lookHome();//编译错误，不能调用子类特有的方法
    }
}

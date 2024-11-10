package com.sdtbu.chapter06;


public class Test01 {
    public static void main(String[] args)
    {
        Animal animal = new Dog();
        test(animal);
        Animal animal1 = new Cat();
        test(animal1);


    }
    public static void test(Animal animal)
    {
        if(animal instanceof Dog)
        {
            Dog dog=(Dog)animal;
            dog.lookHome();
        }
        else if(animal instanceof Cat)
        {
            Cat cat=(Cat)animal;
            cat.catchMouse();
        }
    }
}

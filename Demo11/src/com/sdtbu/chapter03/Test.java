package com.sdtbu.chapter03;

//1.接口可以多继承 -> 一个接口可以继承多个接口
// public interface InterfaceA extends InterfaceB,Interfacec{
// }
// 2.接口可以多实现->一个实现类可以实现一个或者多个接口
// public class InterfaceImpl implements InterfaceA,InterfaceB{
// }
// 3.一个子类可以继承一个父类的同时实现一个或者多个接口
// public class zi extends Fu implements InterfaceA,InterfaceB{
// }
//4.注意:
//继承也好,实现接口也罢,只要是父类中或者接口的抽象方法,子类或者实现类都要重写
public class Test {
    public static void main(String[] args) {
        InterfaceImpl impl = new InterfaceImpl();
        impl.test();

    }
}

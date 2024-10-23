package com.sdtbu.chapter01;
//之前是所有的代码都放到main方法中，使得方法太臃肿，太多
//将不用的功能放入不同的方法中，执行某个功能直接调用对应的方法就可以了
//定义格式
    //方法定义格式 修饰符 返回值类型 方法名（参数列表）{
    // }
    //返回值类型：方法可以返回一个值，也可以不返回值，返回值类型为void
    //参数列表：方法可以有参数，也可以没有参数，参数列表用括号括起来，参数用逗号隔开
    //方法体：方法体中包含具体的功能实现，方法体用大括号括起来

public class Method {    //类
    //1.无参无返回值方法
    public static void car() {
        System.out.println("汽车");//实现方法 直接调用即可 方法名（）；
    }
    //2.有参无返回值方法
    public static void car4(String name) {
        System.out.println("汽车名字：" + name); //直接调用
    }
    //3.无参有返回值方法 哪里调用返回给哪里
    public static String car2() {
        return "汽车";   //间接调用 1.sout打印调用  2.数据类型 + 变量名= 方法名（）

    }
    //4.有参有返回值方法
    public static String car3(String name) {
        return "汽车名字：" + name;
    }
    public static void main(String[] args) {

        car();
        String s = car2();
        System.out.println(s);
        car4("奔驰");
        System.out.println(car3("奔驰"));
        System.out.println(car3("宝马"));
    }

}

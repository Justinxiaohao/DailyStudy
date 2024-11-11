package com.sdtbu.chapter03;
//当一个事物的内部,还有一个部分需要完整的结构去描述,
// 而这个内部的完整结构又只为外部事物提供服务,
// 那么整个内部的完成结构最好使用内部类
public class InterClass {
    public void test(){
        System.out.println("我是外部类的成员方法");
    }

    //静态内部类
   /* 静态内部类可以被final或者abstract修饰
    被final修饰之后,不能被继承
    被abstract修饰之后,不能new */static class  Inner{//内部类可以定义属性 方法和构造器 可以被四种修饰符修饰
        private String name;
        private int age;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }


}

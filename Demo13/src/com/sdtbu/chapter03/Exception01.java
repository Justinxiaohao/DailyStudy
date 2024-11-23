package com.sdtbu.chapter03;
//代表的是不管是否触发了异常，都会执行的代码块，
// 如果执行了system.exit(0)，那么finally中的代码就不会执行了。
public class Exception01 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally中的代码不管是否抛异常都会执行");
        }
    }

}

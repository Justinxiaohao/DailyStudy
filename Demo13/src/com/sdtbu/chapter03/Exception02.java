package com.sdtbu.chapter03;

public class Exception02    {
    public static void main(String[] args)
    {
        int result= method();
        System.out.println(result);
    }
    public static int method()
    {
        try {
            String str= null;
            System.out.println(str.length());
            return 0;

        }catch (Exception e)
            {
                return -1;
            }
        finally {//主要用于释放GarbageC回收不了的垃圾
            System.out.println("finally");
            return 1;
        }
    }
}

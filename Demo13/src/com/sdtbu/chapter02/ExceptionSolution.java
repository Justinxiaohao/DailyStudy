package com.sdtbu.chapter02;

import java.io.FileNotFoundException;
import java.io.IOException;

//1.throws 异常
//在方法参数和方法体中
public class ExceptionSolution {
    public static void main(String[] args) throws IOException {
        String str = "123";
        add(str);
        detele(str);
        update(str);
        query(str);
    }

    private static void update(String str) {
        System.out.println("修改");
    }

    private static void add(String str) throws FileNotFoundException, IOException{
    if(str.isEmpty()){
            throw new IOException("长度不对");
        }
        if(!str.endsWith("3")){
            throw new FileNotFoundException("结尾不对");
        }
        System.out.println("添加");
    }

    private static void query(String str) {
        System.out.println("查询");
    }

    private static void detele(String str) {
        System.out.println("删除");
    }


}

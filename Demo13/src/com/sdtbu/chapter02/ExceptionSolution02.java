package com.sdtbu.chapter02;
/*
try{
    可能出现异常的代码
}catch(异常 对象名){
    处理异常的代码
}
catch(异常 对象名){
    处理异常的代码
}


 */
import java.io.FileNotFoundException;
import java.io.IOException;

//1.throws 异常
//在方法参数和方法体中
public class ExceptionSolution02 {
    public static void main(String[] args) throws IOException {
        String str = "11111111";
        try{
            add(str);
        }catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        }
        detele(str);
        update(str);
        query(str);
    }

    private static void update(String str) {
        System.out.println("修改");
    }
    //throws的多个异常中有子类父类继承关系，则可以直接throw父类异常

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

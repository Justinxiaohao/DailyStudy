package com.sdtbu.chapter02;

public class Exercise4 {
    public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    printArray(arr);
    }
    public static void printArray(int[] arr2){//int[] arr2=arr1; 引用数据类型作为方法参数传递的是地址值 返回引用数据类型时，返回的也是他的地址值
        for (int i =0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }


}


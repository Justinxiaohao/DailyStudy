package com.sdtbu.chapter08;

public class JavaEE  extends Developer{
    @Override
    public void work() {
        System.out.println("员工号"+this.getUid()+"叫"+this.getName()+"正在写javaEE代码");
    }
}

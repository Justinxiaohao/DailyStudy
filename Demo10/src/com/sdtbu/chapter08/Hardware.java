package com.sdtbu.chapter08;

public class Hardware extends Maintainer{
    @Override
    public void work() {
        System.out.println("员工号"+this.getUid()+"叫"+this.getName()+"正在修复电脑主板");
    }
}

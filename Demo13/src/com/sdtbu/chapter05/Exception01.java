package com.sdtbu.chapter05;

import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) throws LoginUserException {
        String username = "admin";
        System.out.println("请输入要登陆的用户名");
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next();
        if (!inputName.equals(username)) {
            try {
            throw new LoginUserException("登陆失败");
        }catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println(e.toString());

        }
        }else{
        System.out.println("登陆成功");
    }
    }

}

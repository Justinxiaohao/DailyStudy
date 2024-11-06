package com.sdtbu.demo.controller;

import com.sdtbu.demo.domain.User;
import com.sdtbu.demo.service.UserService;
import com.sdtbu.demo.utils.Result;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result<User> loginController(@RequestParam String uname, @RequestParam String password) {
        User user = userService.loginService(uname, password);
        if (user != null) {
            return Result.success(user, "登录成功！");
        } else {
            return Result.error("123", "账号或密码错误！");
        }
    }

    @PostMapping("/register")
    public Result<User> registController(@RequestParam String uname, @RequestParam String password){
        User user = userService.registService(uname, password);
        if (user != null) {
            return Result.success(user, "注册成功！");
        } else {
            return Result.error("456", "用户名已存在！");
        }
    }
}

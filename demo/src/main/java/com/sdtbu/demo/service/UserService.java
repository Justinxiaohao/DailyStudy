package com.sdtbu.demo.service;

import com.sdtbu.demo.domain.User;

public interface UserService {

    User loginService(String uname, String password);
    User registService(User user);
}

package com.sdtbu.demo.service.ServiceImpl;
import com.sdtbu.demo.utils.MD5Utils;

import com.sdtbu.demo.domain.User;
import com.sdtbu.demo.repository.UserDAO;
import com.sdtbu.demo.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDao;

    @Override
    public User loginService(String uname, String password) {
        // 如果账号密码都对则返回登录的用户对象，若有一个错误则返回null
        User user = userDao.findByUnameAndPassword(uname, password);
        // 重要信息置空
        if (user != null) {
            user.setPassword("");
        }
        return user;
    }

    @Override
    public User registService(String uname, String password) {
        // 当新用户的用户名已存在时
        if (uname == null || userDao.findByUname(uname) != null) {
            // 无法注册
            return null;
        } else {
            // 对密码进行MD5加密
            String encryptedPassword = MD5Utils.code(password);

            // 创建新用户对象
            User newUser = new User();
            newUser.setUname(uname);
            newUser.setPassword(encryptedPassword);

            // 保存新用户
            User savedUser = userDao.save(newUser);
            if (savedUser != null) {
                // 返回创建好的用户对象(带uid)
                return savedUser;
            } else {
                // 保存失败
                return null;
            }
        }
    }
}

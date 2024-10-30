package com.sdtbu.demo.repository;

import com.sdtbu.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    User findByUname(String uname); //通过用户名uname查找用户，注意要按照JPA的格式使用驼峰命名法
    User findByUnameAndPassword(String uname, String password);//通过用
}

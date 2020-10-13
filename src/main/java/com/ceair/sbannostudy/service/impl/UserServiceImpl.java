package com.ceair.sbannostudy.service.impl;

import com.ceair.sbannostudy.entity.User;
import com.ceair.sbannostudy.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author lvpeng
 * @description
 * @date 2020/10/13-14:07
 */
//@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(int id) {
        User user = new User(id,"丸子","男");
        return user;
    }
}

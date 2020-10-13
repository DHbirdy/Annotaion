package com.ceair.sbannostudy.service.impl;

import com.ceair.sbannostudy.entity.User;
import com.ceair.sbannostudy.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author lvpeng
 * @description
 * @date 2020/10/13-14:32
 */
@Service
public class AdminServiceImpl implements UserService {
    @Override
    public User findUserById(int id) {
        User user = new User(id, "莉香", "女神");
        return user;
    }
}

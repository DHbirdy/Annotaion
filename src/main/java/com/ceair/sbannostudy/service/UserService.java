package com.ceair.sbannostudy.service;

import com.ceair.sbannostudy.entity.User;

/**
 * @author lvpeng
 * @description
 * @date 2020/10/13-14:04
 */
public interface UserService {
    User findUserById(int id);
}

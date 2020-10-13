package com.ceair.sbannostudy.mybeans;

import com.ceair.sbannostudy.service.UserService;
import com.ceair.sbannostudy.service.impl.AdminServiceImpl;
import com.ceair.sbannostudy.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lvpeng
 * @description
 * @date 2020/10/13-15:19
 */
@Configuration
public class MyBeans {
    @Bean(name="user")
    public UserService userServiceImpl(){
        return new UserServiceImpl();
    }
    @Bean(name="admin")
    public UserService adminServiceImpl(){
        return new AdminServiceImpl();
    }
}

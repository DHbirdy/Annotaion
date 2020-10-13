package com.ceair.sbannostudy.controller;

import com.ceair.sbannostudy.entity.User;
import com.ceair.sbannostudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Birdy
 * @descriotion:
 * @create 2020-10-12 23:15
 */
@RestController
@RequestMapping("rest")
public class RestFullController {

//    @Resource(name="userServiceImpl")
    @Autowired
    @Qualifier("user")
    private UserService userService1;

//    @Resource(name="adminServiceImpl")
    @Autowired
    @Qualifier("admin")
    private UserService userService2;

    @GetMapping("get")
    public String get(){
        return "访问地址为 http://localhost:8080/rest/get";
    }

    @GetMapping("finduser/{id}")
    public User findUserById(@PathVariable("id") int id){
//        User user = new User(id,"zhangsan","男");
        User userById = userService1.findUserById(id);
        return userById;
    }
    @GetMapping("findadmin/{id}")
    public User finAdminById(@PathVariable("id") int id){
//        User user = new User(id,"zhangsan","男");
        User userById = userService2.findUserById(id);
        return userById;
    }




}

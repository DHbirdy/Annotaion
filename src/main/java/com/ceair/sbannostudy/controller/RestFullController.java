package com.ceair.sbannostudy.controller;

import com.ceair.sbannostudy.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author Birdy
 * @descriotion:
 * @create 2020-10-12 23:15
 */
@RestController
@RequestMapping("rest")
public class RestFullController {

    @GetMapping("get")
    public String get(){
        return "访问地址为http://localhost:8080/rest/get";
    }
    @GetMapping("find/{id}")
    public User findUserById(@PathVariable("id") int id){
        User user = new User(id,"zhangsan","男");
        return user;
    }


}

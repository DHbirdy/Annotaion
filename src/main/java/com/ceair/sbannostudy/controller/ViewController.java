package com.ceair.sbannostudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Birdy
 * @descriotion:
 * @create 2020-10-12 22:33A
 */
@RestController
public class ViewController {
    @RequestMapping("view")
    public String view(){
        return "view";
    }

    @RequestMapping("param")
    public int params(
            @RequestParam(value = "id",required = false,defaultValue = "0") int id){

        return id;
    }

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }
}

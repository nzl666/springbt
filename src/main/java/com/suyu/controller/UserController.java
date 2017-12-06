package com.suyu.controller;

import com.suyu.domain.User;
import com.suyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/index")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add")
    public String add (User user) {
       int count = userService.insertSelective(user);
       if (count > 0){

           return "success";
       }
       return "error";
    }

}

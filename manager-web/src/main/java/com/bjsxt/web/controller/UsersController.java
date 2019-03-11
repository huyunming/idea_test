package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: huyunming
 * @Date: 2019/3/11 0011
 * @Description: com.bjsxt.web.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {

    @Autowired
    private UsersServices usersServices;

    @RequestMapping("/addUser")
    public String addUser(Users users){
        this.usersServices.addUser(users);
        return "ok";
    }
}

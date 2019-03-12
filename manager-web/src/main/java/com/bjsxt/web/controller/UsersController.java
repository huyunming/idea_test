package com.bjsxt.web.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/doGet/{userid}", method = RequestMethod.GET)
    public String doGet(@PathVariable Integer userid){
        System.out.println("doGet....."+userid);
        return "ok";
    }

    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public String doPost(Users users){
        System.out.println("doPost......"+users);
        return "ok";
    }

    @RequestMapping(value = "/doDelete",method = RequestMethod.DELETE)
    public String doDelete(Integer userid){
        System.out.println("doDelete......"+userid);
        return "ok";
    }

    @RequestMapping(value = "/doPut",method = RequestMethod.PUT)
    public String doPut(){
        System.out.println("doPut......");
        return "ok";
    }
}

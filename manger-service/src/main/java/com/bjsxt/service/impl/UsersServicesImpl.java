package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: huyunming
 * @Date: 2019/3/11 0011
 * @Description: com.bjsxt.service.impl
 * @version: 1.0
 */
@Service
public class UsersServicesImpl implements UsersServices {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}

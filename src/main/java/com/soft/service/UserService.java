package com.soft.service;


import com.soft.beans.User;
import com.soft.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author : 东方不败
 * Date : 2022/12/22 上午 9:34
 */
@Service
/*@Scope("prototype") */ // 多例 singleton 单例
public class UserService {


    @Autowired
    private UserMapper userMapper;


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public List<User> getUsers(User user) {
        return userMapper.getUserList(user);
    }

}

package com.soft.web;

import com.soft.beans.User;
import com.soft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Author : 东方不败
 * Date : 2022/12/22 上午 9:34
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void getUserById(User user) {
        List<User> users = userService.getUsers(user);
        for (User u : users) {
            System.out.println(u);
        }

    }

}

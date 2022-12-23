package com.soft.test;

import com.soft.beans.User;
import com.soft.web.UserController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author : 东方不败
 * Date : 2022/12/22 上午 9:34
 */
public class TestMain {
    private static Logger logger = LoggerFactory.getLogger(TestMain.class.getName());

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext*.xml" );
        UserController userController = context.getBean("userController" ,UserController.class);
        userController.getUserById(new User());

    }
}

package com.soft.test;

import com.soft.beans.User;
import com.soft.web.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Author : 东方不败
 * Date : 2022/12/23 上午 9:38
 */
@WebServlet("/userTest")
public class UserTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = context.getBean("userController" ,UserController.class);
        userController.getUserById(new User());




    }
}

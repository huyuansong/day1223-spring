package com.soft.dao;

import com.soft.beans.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author : 东方不败
 * Date : 2022/12/22 上午 9:33
 */


public interface UserMapper {

    List<User> getUserList(User user);


}

package com.ccj.service;

import com.ccj.dao.UserDao;

/**
 * @author ccj
 * @create 2020-07-12 16:13
 */
public interface UserService {
    void setUserDao(UserDao userDao);
    void getUser();
}

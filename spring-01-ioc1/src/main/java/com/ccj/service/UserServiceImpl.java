package com.ccj.service;

import com.ccj.dao.UserDao;

/**
 * @author ccj
 * @create 2020-07-12 16:14
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    //利用set实现动态的值的注入
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}

package com.example.boss_train.Service.impl;

import com.example.boss_train.Dao.UserDao;
import com.example.boss_train.Entity.User;
import com.example.boss_train.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public User queryByAccount(String account) {
        return dao.queryByAccount(account);
    }
}

package com.example.boss_train.Service;


import com.example.boss_train.Entity.User;

public interface UserService {
    void save(User user);
    User queryByAccount(String account);
}

package com.example.boss_train.Dao;

import com.example.boss_train.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    void save(User user);
    User queryByAccount(String account);
}

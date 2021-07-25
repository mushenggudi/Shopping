package com.example.boss_train.Dao;

import com.example.boss_train.Entity.Cart;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CartDao {
    void save(Cart cart);
    int delete(String cartID);
    Cart queryById(String cartID);
    void update(Cart cart);
}

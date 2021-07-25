package com.example.boss_train.Service.impl;

import com.example.boss_train.Dao.CartDao;
import com.example.boss_train.Entity.Cart;
import com.example.boss_train.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    CartDao dao;
    @Override
    public void save(Cart cart) {
        dao.save(cart);
    }

    @Override
    public int delete(String cartID) {
        return dao.delete(cartID);
    }

    @Override
    public Cart queryById(String cartID) {
        return dao.queryById(cartID);
    }

    @Override
    public void update(Cart cart) {
        dao.update(cart);
    }
}

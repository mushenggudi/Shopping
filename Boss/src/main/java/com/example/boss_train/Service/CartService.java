package com.example.boss_train.Service;

import com.example.boss_train.Entity.Cart;

public interface CartService {
    void save(Cart cart);
    int delete(String cartID);
    Cart queryById(String cartID);
    void update(Cart cart);
}

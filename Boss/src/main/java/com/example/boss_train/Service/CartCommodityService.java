package com.example.boss_train.Service;

import com.example.boss_train.Entity.Cart;
import com.example.boss_train.Entity.CartCommodity;
import com.example.boss_train.Entity.Commodity;

import java.util.List;

public interface CartCommodityService {
    void save(CartCommodity cartCommodity);
    int deleteByCart(Cart cart);
    int deleteByCommodity(Commodity commodity);
    void update(CartCommodity cartCommodity);
    List<CartCommodity> queryByCart(Cart cart);
}

package com.example.boss_train.Dao;

import com.example.boss_train.Entity.Cart;
import com.example.boss_train.Entity.CartCommodity;
import com.example.boss_train.Entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartCommodityDao {
    void save(CartCommodity cartCommodity);
    int deleteByCart(Cart cart);
    int deleteByCommodity(Commodity commodity);
    void update(CartCommodity cartCommodity);
    List<CartCommodity> queryByCart(Cart cart);
}

package com.example.boss_train.Service.impl;

import com.example.boss_train.Dao.CartCommodityDao;
import com.example.boss_train.Entity.Cart;
import com.example.boss_train.Entity.CartCommodity;
import com.example.boss_train.Entity.Commodity;
import com.example.boss_train.Service.CartCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartCommodityServiceImpl implements CartCommodityService {
    @Autowired
    CartCommodityDao dao;
    @Override
    public void save(CartCommodity cartCommodity) {
        dao.save(cartCommodity);
    }

    @Override
    public int deleteByCart(Cart cart) {
        return dao.deleteByCart(cart);
    }

    @Override
    public int deleteByCommodity(Commodity commodity) {
        return dao.deleteByCommodity(commodity);
    }

    @Override
    public void update(CartCommodity cartCommodity) {
        dao.update(cartCommodity);
    }

    @Override
    public List<CartCommodity> queryByCart(Cart cart) {
        return dao.queryByCart(cart);
    }
}

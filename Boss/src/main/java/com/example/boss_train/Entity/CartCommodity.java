package com.example.boss_train.Entity;

import lombok.Data;

@Data
public class CartCommodity {
    private Cart cart;
    private Commodity commodity;
    private int num;
}

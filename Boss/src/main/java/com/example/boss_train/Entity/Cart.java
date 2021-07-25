package com.example.boss_train.Entity;

import lombok.Data;

@Data
public class Cart {
    private String cartID;
    private User user;
    private double totalPrice;
}

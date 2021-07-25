package com.example.boss_train.Controller;

import com.example.boss_train.Entity.Cart;
import com.example.boss_train.Service.CartService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Cart")
public class CartController {
    @Autowired
    CartService service;
    @PostMapping("save")
    public String save(@RequestBody Cart cart){
        if(service.queryById(cart.getCartID()) == null){
            service.save(cart);
            return "创建成功";
        }
        else{
            return "创建失败";
        }
    }
    @GetMapping("queryById")
    public Cart queryById(String cartID){
        return service.queryById(cartID);
    }
    @DeleteMapping("deleteById")
    public int delete(String cartID){
        return service.delete(cartID);
    }
    @PostMapping("update")
    public String update(@RequestBody Cart cart){
        service.update(cart);
        return "更改成功";
    }
}

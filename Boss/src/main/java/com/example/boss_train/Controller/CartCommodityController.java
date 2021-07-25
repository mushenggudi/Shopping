package com.example.boss_train.Controller;

import com.example.boss_train.Entity.Cart;
import com.example.boss_train.Entity.CartCommodity;
import com.example.boss_train.Entity.Commodity;
import com.example.boss_train.Service.CartCommodityService;
import com.example.boss_train.vo.ShopList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;
import java.net.HttpCookie;
import java.util.List;

@RestController
@RequestMapping("/CartCommodity")
public class CartCommodityController {
    @Autowired
    CartCommodityService service;
    @PostMapping("/save")
    public void save(@RequestBody CartCommodity cartCommodity){
        service.save(cartCommodity);
    }
    @GetMapping("queryByCart")
    public List<CartCommodity> queryByCart(@RequestBody Cart cart){
        return service.queryByCart(cart);
    }
    @DeleteMapping("deleteByCart")
    public int deleteByCart(@RequestBody Cart cart){
        return service.deleteByCart(cart);
    }
    @DeleteMapping("deleteByCommodity")
    public int deleteByCommodity(@RequestBody Commodity commodity){
        return service.deleteByCommodity(commodity);
    }
    @PostMapping("update")
    public String update(@RequestBody CartCommodity cartCommodity){
        service.update(cartCommodity);
        return "更新完成";
    }
    @PostMapping("cookie")
    public static void saveCookie(HttpServletResponse response, @RequestBody ShopList list)
    {
        List<String> id = list.getId();
        List<String> num = list.getNum();
        for(int i =0; i<id.size();i++){
            String name = id.get(i);
            String number = num.get(i);
            Cookie cookie = new Cookie(name,number);
            response.addCookie(cookie);
        }
    }


}

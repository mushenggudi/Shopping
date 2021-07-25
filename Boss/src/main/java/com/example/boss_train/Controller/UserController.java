package com.example.boss_train.Controller;

import com.example.boss_train.Entity.User;
import com.example.boss_train.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService service;
    @PostMapping("/register")
    public String Register(@RequestBody User user){
        if(service.queryByAccount(user.getAccount()) == null){
            service.save(user);
            return "注册成功";
        }
        else{
            return "该账号已存在";
        }
    }
    @GetMapping("/login")
    public User Login(String account){
            return service.queryByAccount(account);
    }
}

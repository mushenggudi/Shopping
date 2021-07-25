package com.example.boss_train.Controller;

import com.example.boss_train.Entity.Commodity;
import com.example.boss_train.Service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commodity")
public class CommodityController {
    @Autowired
    CommodityService service;
    @GetMapping("/queryAll")
    public List<Commodity> queryAll(){
        return service.queryAll();
    }
    @GetMapping("/queryById")
    public Commodity queryById(String commodityID){
        return service.queryById(commodityID);
    }
    @PostMapping("/save")
    public String save(@RequestBody Commodity commodity){
        if(service.queryById(commodity.getCommodityID()) == null){
            service.save(commodity);
            return "插入成功";
        }
        else{
            return "商品ID存在";
        }
    }
    @DeleteMapping("delete")
    public int delete(String commodityID){
        return service.delete(commodityID);
    }
    @DeleteMapping("deletePatch")
    public int deletePatch(@RequestBody List<String> ids){
        return service.deletePatch(ids);
    }
    @PostMapping("update")
    public String update(@RequestBody Commodity commodity){
        service.update(commodity);
        return "修改成功";
    }
}

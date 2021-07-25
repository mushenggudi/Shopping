package com.example.boss_train.Service;

import com.example.boss_train.Entity.Commodity;

import java.util.List;

public interface CommodityService {
    void save(Commodity commodity);
    int delete(String commodityID);
    int deletePatch(List<String> ids);
    Commodity queryById(String commodityID);
    int update(Commodity commodity);
    List<Commodity> queryAll();
}

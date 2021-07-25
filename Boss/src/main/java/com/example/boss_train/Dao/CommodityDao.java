package com.example.boss_train.Dao;

import com.example.boss_train.Entity.Commodity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityDao {
    void save(Commodity commodity);
    int delete(String commodityID);
    int deletePatch(List<String> ids);
    Commodity queryById(String commodityID);
    int update(Commodity commodity);
    List<Commodity> queryAll();
}

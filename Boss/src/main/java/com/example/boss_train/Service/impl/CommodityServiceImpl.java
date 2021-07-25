package com.example.boss_train.Service.impl;

import com.example.boss_train.Dao.CommodityDao;
import com.example.boss_train.Entity.Commodity;
import com.example.boss_train.Service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    CommodityDao dao;
    @Override
    public void save(Commodity commodity) {
        dao.save(commodity);
    }

    @Override
    public int delete(String commodityID) {

        return dao.delete(commodityID);
    }

    @Override
    public int deletePatch(List<String> ids) {
        return dao.deletePatch(ids);
    }

    @Override
    public Commodity queryById(String commodityID) {
        return dao.queryById(commodityID);
    }

    @Override
    public int update(Commodity commodity) {
        return dao.update(commodity);
    }

    @Override
    public List<Commodity> queryAll() {
        return dao.queryAll();
    }
}

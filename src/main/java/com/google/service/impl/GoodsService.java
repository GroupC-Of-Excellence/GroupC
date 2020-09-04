package com.google.service.impl;

import com.github.pagehelper.PageHelper;
import com.google.service.IGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GoodsService implements IGoodService{
    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> loadGoods(int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        return goodsMapper.loadGoods();
    }

    public int calcPage(int pageSize) {
        int total=goodsMapper.getTotal();
        return total%pageSize==0?total/pageSize:total/pageSize+1;
    }
}

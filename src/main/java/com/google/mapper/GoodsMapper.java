package com.google.mapper;

import com.google.entity.Goods;

import java.util.Date;
import java.util.List;

public interface GoodsMapper {
    //店铺添加商品信息
    int addGoods(Goods goods);
    //店铺修改商品信息
    int alterGoods(Goods goods);
    //查询所有商品信息
    List<Goods> loadAllGoods();
    //按商品号查询商品信息
    List<Goods> loadGoodsById(int gono);
    //按名称查询商品
    List<Goods> loadGoodsByName(String goname);
    //按分类查询商品
    List<Goods> loadGoodsByType(int gotpno);
    //按品牌查询商品
    List<Goods> loadGoodsByBrand(int brno);
    //按年月查询商品
    List<Goods> loadGoodsByMonth(Date date);
    //批量删除商品
    int deleteGoods(int[] gono);
    //修改商品状态
    int alterGoodsState();
}

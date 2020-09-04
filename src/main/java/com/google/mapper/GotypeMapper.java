package com.google.mapper;

import com.google.entity.Gotype;

public interface GotypeMapper {
    //店铺添加商品分类
    int addGoodsType(Gotype gotype);
    //店铺删除商品分类
    int deleteGoodsType(int[] gotype);
}

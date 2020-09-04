package com.google.mapper;

import com.google.entity.Goods;

import java.util.List;

public interface CartMapper {
    //用户查询购物车中所有商品
    List<Goods> loadCart(int usno);

    //用户添加商品到购物车
    int addCart(Goods goods);

    //用户删除购物车中商品
    int deleteCart();
}

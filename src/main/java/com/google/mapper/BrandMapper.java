package com.google.mapper;

import com.google.entity.Brand;

public interface BrandMapper {
    //店铺添加商品品牌
    int addBrand(Brand brand);
    //店铺删除商品品牌
    int delete(int brno);
}

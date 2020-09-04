package com.google.mapper;

import com.google.entity.Gphoto;

public interface GphotoMapper {

    //店铺添加商品图片
    int addGphoto(Gphoto gphoto);
    //店铺删除商品图片
    int deleteGphtot(int gpno);
}

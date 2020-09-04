package com.google.mapper;

import com.google.entity.Adtype;

public interface AdtypeMapper {
    //添加广告分类
    int addAdtype(Adtype adtype);

    //删除广告分类
    int deleteAdtype(int adtno);
}

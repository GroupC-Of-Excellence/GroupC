package com.google.mapper;

import com.google.entity.Arttype;

public interface ArttypeMapper {
    //添加文章分类
    int addArttype(Arttype arttype);
    //删除文章分类
    int deletArttype(int arttno);
}

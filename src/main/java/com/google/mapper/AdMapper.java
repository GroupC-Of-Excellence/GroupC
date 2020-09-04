package com.google.mapper;

import com.google.entity.Ad;

public interface AdMapper {
    //添加广告
    int addAd(Ad ad);
    //删除广告
    int deleteAd(int adno);
}

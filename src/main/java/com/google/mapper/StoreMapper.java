package com.google.mapper;

import com.google.entity.Store;

public interface StoreMapper {
    //店铺后台登陆
    int storeLogin(Store store);
    //店铺注册
    int registerStore(Store store);
    //店铺修改密码
    int alterStorePwd(Store store);

    //加载店铺信息
    Store loadStoreById(int stno);
}

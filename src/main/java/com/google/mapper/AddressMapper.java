package com.google.mapper;

import com.google.entity.Address;

public interface AddressMapper {
    //用户添加收货地址
    int addAddress(Address address);
    //用户删除收货地址
    int deleteAddress(int addrno);
    //用户修改收货地址
    int alterAddress(Address address);
}

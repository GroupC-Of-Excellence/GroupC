package com.google.mapper;

import com.google.entity.Admin;

public interface AdminMapper {
    //管理员登录
    int adminLogin(Admin admin);
    //管理员改密码
    int alterAdminPwd(Admin admin);
}

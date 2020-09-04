package com.google.mapper;

import com.google.entity.Users;

public interface UsersMapper {
    //用户登录
    int userLogin(Users users);
    //用户注册
    int userRegister(Users users);
    //用户修改密码
    int alterUserPwd(Users users);
    //加载用户信息
    Users loadUsersById(int usno);
    //用户修改头像
    int alterUserUphoto(String uphoto);
    //用户修改昵称
    int alterUname(Users users);
    //用户修改微信号
    int alterUwechat(Users users);
    //用户修改性别
    int alterUses(Users users);
    //用户修改个性签名
    int alterUsignature(Users users);
}

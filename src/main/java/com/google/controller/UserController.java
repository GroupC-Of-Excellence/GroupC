package com.google.controller;

import com.google.entity.*;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {
    //用户登录
    @RequestMapping("/login")
    @ResponseBody
    public boolean userLogin(User user){

    }
    //验证码检验
    @RequestMapping("/verCode")
    @ResponseBody
    public boolean userVerCode(String phoneNumber,String verNumber){

    }
    //注册填写账户信息(PC端)
    @RequestMapping("/sign")
    @ResponseBody
    public boolean userSign(String phoneNumber,String area){

    }
    //注册填写账户信息(APP端)
    @RequestMapping("/sign")
    @ResponseBody
    public boolean userSign(String phoneNumber,String verCode,String pwd,String newPwd){

    }
    //修改密码
    @RequestMapping("/resetPwd")
    @ResponseBody
    public boolean userResetPwd(String newPwd,String pwd,int userId){

    }

    //加载用户信息
    @RequestMapping("/loadUser")
    @ResponseBody
    public User loadUser(int id){

    }
    //用户修改头像
    @RequestMapping("/updateUphoto")
    @ResponseBody
    public boolean updateUphoto(String url,int usrUphoto){

    }

    //用户修改昵称
    @RequestMapping("/updateName")
    @ResponseBody
    public boolean updateName(String name,int userId){

    }
    //用户修改微信号
    @RequestMapping("/updateWeChat")
    @ResponseBody
    public boolean updateWeChat(String weChat,int userId){

    }
    //用户修改性别
    @RequestMapping("/updateSex")
    @ResponseBody
    public boolean updateSex(char Sex,int userId){

    }
    //用户修改个性签名
    @RequestMapping("/updateUsigNature")
    @ResponseBody
    public boolean updateUsigNature(String usigNature,int userId){

    }
    //用户查询所有订单信息（订单表）
    @RequestMapping("/loadOrders")
    @ResponseBody
    public String loadOrders(@RequestParam(required = false,defaultValue = "0") int page,
                                      @RequestParam(required = false,defaultValue = "10")int pageSize){


    }
    //用户付款订单(订单表)
    @RequestMapping("/updateOrderState")
    @ResponseBody
    public boolean updateOrderState(String ids){

    }
    //用户删除订单（订单表）
    @RequestMapping("/deleteOrder")
    @ResponseBody
    public boolean deleteOrder(String ids){

    }
    //用户查看退款/售后订单信息（订单表）
    @RequestMapping("/loadOrderRefund")
    @ResponseBody
    public String loadOrderRefund(@RequestParam(required = false,defaultValue = "0") int page,
                                  @RequestParam(required = false,defaultValue = "10")int pageSize){

    }
//用户查询所有订单信息（购物车）
    @RequestMapping("/loadOrderCart")
    @ResponseBody
    public String loadOrderCart(@RequestParam(required = false,defaultValue = "0") int page,
                                @RequestParam(required = false,defaultValue = "10")int pageSize){

    }
    //用户付款订单（购物车）
    @RequestMapping("/payCart")
    @ResponseBody
    public boolean payCart(String ids){

    }
    //用户删除订单（购物车）
    @RequestMapping("/deleteCart")
    @ResponseBody
    public boolean deleteCart(String ids){

    }
    //用户查看退款/售后订单信息（购物车）
    @RequestMapping("/loadCartRefund")
    @ResponseBody
    public String loadCartRefund(@RequestParam(required = false,defaultValue = "0") int page,
                                 @RequestParam(required = false,defaultValue = "10")int pageSize){

    }
}

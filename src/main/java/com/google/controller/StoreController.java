package com.google.controller;

import com.google.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@RequestMapping("/store")
@Controller
public class StoreController {
    //登陆
    @RequestMapping("/storeLogin")
    @ResponseBody
    public boolean storeLogin(Store store){

    }
    //验证码检验
    @RequestMapping("/verCode")
    @ResponseBody
    public boolean storeVerCode(String phoneNumber,String verNumber){

    }
    //注册填写账户信息
    @RequestMapping("/sign")
    @ResponseBody
    public boolean storeSign(String accont,String pwd,String pwdPardon ){

    }
    //重置密码
    @RequestMapping("/resetPwd")
    @ResponseBody
    public boolean storeResetPwd(String newPwd,String pwd,int storeId){

    }
    //查看订单信息
    @RequestMapping("/loadOrders")
    @ResponseBody
    public List<Orderform>  loadOrders(@RequestParam(required = false,defaultValue = "0") int page,
                                       @RequestParam(required = false,defaultValue = "10")int pageSize,
                                       int storeId){

    }
    //通过名称查询订单
    @RequestMapping("/loadOrdersByName")
    @ResponseBody
    public List<Orderform> loadOrdersByName(@RequestParam(required = false,defaultValue = "0") int page,
                                            @RequestParam(required = false,defaultValue = "10")int pageSize,
                                            String name,int storeId){

    }
    //通过时间查询订单
    @RequestMapping("/loadOrdersByDate")
    @ResponseBody
    public List<Orderform> loadOrderByDate(@RequestParam(required = false,defaultValue = "0") int page,
                                           @RequestParam(required = false,defaultValue = "10")int pageSize,
                                           Date date,int storeId){

    }
    //通过状态查询订单
    @RequestMapping("/loadOrderByState")
    @ResponseBody
    public String loadOrderByState(@RequestParam(required = false,defaultValue = "0") int page,
                                   @RequestParam(required = false,defaultValue = "10")int pageSize,
                                   String state,int storeId){

    }
    //通过分类查找订单
    @RequestMapping("/loadOrderBySort")
    @ResponseBody
    public String loadOrderBySort(@RequestParam(required = false,defaultValue = "0") int page,
                                  @RequestParam(required = false,defaultValue = "10")int pageSize,
                                  String sort,int storeId){

    }
    //修改订单状态
    @RequestMapping("/updateOrderState")
    @ResponseBody
    public boolean updateOrderState(String state,int storeId){

    }
    //删除订单
    @RequestMapping("/deleteOrder")
    @ResponseBody
    public boolean deleteOrder(String ids){

    }
    //查看交易情况
    @RequestMapping("/loadDeals")
    @ResponseBody
    public String loadDeals(@RequestParam(required = false,defaultValue = "0") int page,
                            @RequestParam(required = false,defaultValue = "10")int pageSize,
                            int storeId){

    }
    //查找总交易额
    @RequestMapping("/loadTotalPrice")
    @ResponseBody
    public double loadTotalPrice(int storeId){

    }
    //按年月查找交易额
    @RequestMapping("/loadPriceByDate")
    @ResponseBody
    public double loadPriceByDate(int storeid,Date date){

    }



}

package com.google.controller;

import com.google.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/admin")
@Controller
public class AdminController {
    //管理员登陆
    @RequestMapping("/login")
    @ResponseBody
    public boolean adminLogin( Admin admin){

    }
    //验证码检验
    @RequestMapping("/verCode")
    @ResponseBody
    public boolean adminVerCode(String phoneNumber,String verNumber){

    }
    //注册填写账户信息
    @RequestMapping("/sign")
    @ResponseBody
    public boolean adminSign(String accont,String pwd,String pwdPardon ){

    }
    //重置密码
    @RequestMapping("/resetPwd")
    @ResponseBody
    public boolean adminResetPwd(String newPwd,String pwd,int adminId){

    }
    //查看广告
    @RequestMapping("/loadAds")
    @ResponseBody
    public String loadAds(@RequestParam(required = false,defaultValue = "0") int page,
                            @RequestParam(required = false,defaultValue = "10")int pageSize){

    }
    //添加广告
    @RequestMapping("/addAd")
    @ResponseBody
    public boolean adminAddAd(Ad ad){

    }
    //添加广告分类
    @RequestMapping("/addAdtype")
    @ResponseBody
    public boolean adminAddAdtype(Adtype adtype){

    }
    //修改用户状态(未添加)
    @RequestMapping("/updateUserState")
    @ResponseBody
    public boolean updateUserState(){

    }
    //查看店铺信息
    @RequestMapping("/loadStore")
    @ResponseBody
    public String loadStore(@RequestParam(required = false,defaultValue = "0") int page,
                                 @RequestParam(required = false,defaultValue = "10")int pageSize){

    }
    //查看用户信息
    @RequestMapping("/loadUsers")
    @ResponseBody
    public String loadUsers(@RequestParam(required = false,defaultValue = "0") int page,
                                 @RequestParam(required = false,defaultValue = "10")int pageSize){

    }
    //修改店铺状态
    @RequestMapping("/updateStoreState")
    @ResponseBody
    public boolean updateStoreState(String state,int storeId){

    }
    //添加店铺
    @RequestMapping("/addStore")
    @ResponseBody
    public boolean addStore(Store store){

    }
    //添加文章
    @RequestMapping("/addArticle")
    @ResponseBody
    public boolean addArticle(Article article){

    }
    //删除文章
    @RequestMapping("/deleteArticle")
    @ResponseBody
    public boolean deleteArtcle(String ids){

    }
    //查看文章
    @RequestMapping("/loadArtcles")
    @ResponseBody
    public String loadArtcles(@RequestParam(required = false,defaultValue = "0") int page,
                               @RequestParam(required = false,defaultValue = "10")int pageSize){

    }
    //修改文章状态
    @RequestMapping("/updateArtcleState")
    @ResponseBody
    public boolean updateArtcleState(int id,String state){

    }


}

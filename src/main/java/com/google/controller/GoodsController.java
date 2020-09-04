package com.google.controller;

import com.google.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/goods")
@Controller
public class GoodsController {
    //分页加载所有商品
    @RequestMapping("/loadGoods")
    @ResponseBody
    public String loadGoods(@RequestParam(required = false,defaultValue = "0") int page,
                            @RequestParam(required = false,defaultValue = "10")int pageSize,
                            ){

    }
    //添加商品
    @RequestMapping("/addGoods")
    @ResponseBody
    public boolean addGoods(@RequestParam(required = true)Goods goods){

    }
    //删除商品
    @RequestMapping("/deleteGoods")
    @ResponseBody
    public boolean deleteGoods(@RequestParam(required = true) String ids){

    }
    //修改商品
    @RequestMapping("/updateGoods")
    @ResponseBody
    public boolean updateGoods(@RequestParam(required = true) int id){

    }
    //通过商品ID查找商品
    @RequestMapping("/loadById")
    @ResponseBody
    public Goods loadById(@RequestParam(required = true) int id){

    }
    //通过商品分类查找商品
    @RequestMapping("/loadBySort")
    @ResponseBody
    public List<Goods> loadBySort(@RequestParam(required = false,defaultValue = "0") int page,
                                  @RequestParam(required = false,defaultValue = "10")int pageSize,
                                  @RequestParam(required = true)int storeId,
                                  @RequestParam(required = true)int typeId){

    }
    //通过商品品牌查找商品
    @RequestMapping("/loadByBrand")
    @ResponseBody
    public List<Goods> loadByBrand(@RequestParam(required = false,defaultValue = "0") int page,
                                   @RequestParam(required = false,defaultValue = "10")int pageSize,
                                   @RequestParam(required = true)int brandId){

    }
    //按商品名称模糊查询
    @RequestMapping("/loadByName")
    @ResponseBody
    public List<Goods> loadByName(@RequestParam(required = false,defaultValue = "0") int page,
                                  @RequestParam(required = false,defaultValue = "10")int pageSize,
                                  @RequestParam(required = true)String goodName){

    }


}

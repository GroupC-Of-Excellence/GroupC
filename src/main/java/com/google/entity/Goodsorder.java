package com.google.entity;


import java.io.Serializable;

public class Goodsorder implements Serializable {

  private long gono;
  private long orno;
  private long goodsnum;


  public long getGono() {
    return gono;
  }

  public void setGono(long gono) {
    this.gono = gono;
  }


  public long getOrno() {
    return orno;
  }

  public void setOrno(long orno) {
    this.orno = orno;
  }


  public long getGoodsnum() {
    return goodsnum;
  }

  public void setGoodsnum(long goodsnum) {
    this.goodsnum = goodsnum;
  }

  @Override
  public String toString() {
    return "Goodsorder{" +
            "gono=" + gono +
            ", orno=" + orno +
            ", goodsnum=" + goodsnum +
            '}';
  }
}

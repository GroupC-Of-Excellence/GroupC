package com.google.entity;


import java.io.Serializable;

public class Goodscart implements Serializable {

  private long gono;
  private long cano;
  private long buynum;


  public long getGono() {
    return gono;
  }

  public void setGono(long gono) {
    this.gono = gono;
  }


  public long getCano() {
    return cano;
  }

  public void setCano(long cano) {
    this.cano = cano;
  }


  public long getBuynum() {
    return buynum;
  }

  public void setBuynum(long buynum) {
    this.buynum = buynum;
  }

  @Override
  public String toString() {
    return "Goodscart{" +
            "gono=" + gono +
            ", cano=" + cano +
            ", buynum=" + buynum +
            '}';
  }
}

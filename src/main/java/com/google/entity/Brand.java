package com.google.entity;


public class Brand {

  private long brno;
  private String brname;
  private String brmarks;


  public long getBrno() {
    return brno;
  }

  public void setBrno(long brno) {
    this.brno = brno;
  }


  public String getBrname() {
    return brname;
  }

  public void setBrname(String brname) {
    this.brname = brname;
  }


  public String getBrmarks() {
    return brmarks;
  }

  public void setBrmarks(String brmarks) {
    this.brmarks = brmarks;
  }

  @Override
  public String toString() {
    return "Brand{" +
            "brno=" + brno +
            ", brname='" + brname + '\'' +
            ", brmarks='" + brmarks + '\'' +
            '}';
  }
}

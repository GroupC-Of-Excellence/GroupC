package com.google.entity;


import java.io.Serializable;

public class Users implements Serializable {

  private long usno;
  private String uname;
  private String upwd;
  private String usex;
  private long addresscount;
  private String uphonenum;
  private String uphoto;
  private String usignature;
  private String uwechat;
  private long addrnum;


  public long getUsno() {
    return usno;
  }

  public void setUsno(long usno) {
    this.usno = usno;
  }


  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }


  public String getUpwd() {
    return upwd;
  }

  public void setUpwd(String upwd) {
    this.upwd = upwd;
  }


  public String getUsex() {
    return usex;
  }

  public void setUsex(String usex) {
    this.usex = usex;
  }


  public long getAddresscount() {
    return addresscount;
  }

  public void setAddresscount(long addresscount) {
    this.addresscount = addresscount;
  }


  public String getUphonenum() {
    return uphonenum;
  }

  public void setUphonenum(String uphonenum) {
    this.uphonenum = uphonenum;
  }


  public String getUphoto() {
    return uphoto;
  }

  public void setUphoto(String uphoto) {
    this.uphoto = uphoto;
  }


  public String getUsignature() {
    return usignature;
  }

  public void setUsignature(String usignature) {
    this.usignature = usignature;
  }


  public String getUwechat() {
    return uwechat;
  }

  public void setUwechat(String uwechat) {
    this.uwechat = uwechat;
  }


  public long getAddrnum() {
    return addrnum;
  }

  public void setAddrnum(long addrnum) {
    this.addrnum = addrnum;
  }

  @Override
  public String toString() {
    return "Users{" +
            "usno=" + usno +
            ", uname='" + uname + '\'' +
            ", upwd='" + upwd + '\'' +
            ", usex='" + usex + '\'' +
            ", addresscount=" + addresscount +
            ", uphonenum='" + uphonenum + '\'' +
            ", uphoto='" + uphoto + '\'' +
            ", usignature='" + usignature + '\'' +
            ", uwechat='" + uwechat + '\'' +
            ", addrnum=" + addrnum +
            '}';
  }
}

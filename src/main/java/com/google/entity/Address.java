package com.google.entity;


import java.io.Serializable;

public class Address implements Serializable {

  private long addrno;
  private long usno;
  private String addressinfo;
  private String linkmanphone;
  private String linkmanname;
  private long state;


  public long getAddrno() {
    return addrno;
  }

  public void setAddrno(long addrno) {
    this.addrno = addrno;
  }


  public long getUsno() {
    return usno;
  }

  public void setUsno(long usno) {
    this.usno = usno;
  }


  public String getAddressinfo() {
    return addressinfo;
  }

  public void setAddressinfo(String addressinfo) {
    this.addressinfo = addressinfo;
  }


  public String getLinkmanphone() {
    return linkmanphone;
  }

  public void setLinkmanphone(String linkmanphone) {
    this.linkmanphone = linkmanphone;
  }


  public String getLinkmanname() {
    return linkmanname;
  }

  public void setLinkmanname(String linkmanname) {
    this.linkmanname = linkmanname;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Address{" +
            "addrno=" + addrno +
            ", usno=" + usno +
            ", addressinfo='" + addressinfo + '\'' +
            ", linkmanphone='" + linkmanphone + '\'' +
            ", linkmanname='" + linkmanname + '\'' +
            ", state=" + state +
            '}';
  }
}

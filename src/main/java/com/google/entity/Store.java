package com.google.entity;


import java.io.Serializable;

public class Store implements Serializable {

  private long stno;
  private String stname;
  private String stprofiles;
  private long attnumber;
  private long goodsnumber;
  private String state;


  public long getStno() {
    return stno;
  }

  public void setStno(long stno) {
    this.stno = stno;
  }


  public String getStname() {
    return stname;
  }

  public void setStname(String stname) {
    this.stname = stname;
  }


  public String getStprofiles() {
    return stprofiles;
  }

  public void setStprofiles(String stprofiles) {
    this.stprofiles = stprofiles;
  }


  public long getAttnumber() {
    return attnumber;
  }

  public void setAttnumber(long attnumber) {
    this.attnumber = attnumber;
  }


  public long getGoodsnumber() {
    return goodsnumber;
  }

  public void setGoodsnumber(long goodsnumber) {
    this.goodsnumber = goodsnumber;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Store{" +
            "stno=" + stno +
            ", stname='" + stname + '\'' +
            ", stprofiles='" + stprofiles + '\'' +
            ", attnumber=" + attnumber +
            ", goodsnumber=" + goodsnumber +
            ", state='" + state + '\'' +
            '}';
  }
}

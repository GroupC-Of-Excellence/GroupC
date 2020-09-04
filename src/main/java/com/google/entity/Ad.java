package com.google.entity;


import java.io.Serializable;

public class Ad implements Serializable {

  private long adno;
  private long adtno;
  private String adaddress;
  private java.sql.Date addate;
  private long valu;
  private String state;


  public long getAdno() {
    return adno;
  }

  public void setAdno(long adno) {
    this.adno = adno;
  }


  public long getAdtno() {
    return adtno;
  }

  public void setAdtno(long adtno) {
    this.adtno = adtno;
  }


  public String getAdaddress() {
    return adaddress;
  }

  public void setAdaddress(String adaddress) {
    this.adaddress = adaddress;
  }


  public java.sql.Date getAddate() {
    return addate;
  }

  public void setAddate(java.sql.Date addate) {
    this.addate = addate;
  }


  public long getValu() {
    return valu;
  }

  public void setValu(long valu) {
    this.valu = valu;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Ad{" +
            "adno=" + adno +
            ", adtno=" + adtno +
            ", adaddress='" + adaddress + '\'' +
            ", addate=" + addate +
            ", valu=" + valu +
            ", state='" + state + '\'' +
            '}';
  }
}

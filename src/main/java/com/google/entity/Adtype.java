package com.google.entity;


import java.io.Serializable;

public class Adtype implements Serializable {

  private long adtno;
  private String adtypename;
  private java.sql.Date addate;
  private String state;


  public long getAdtno() {
    return adtno;
  }

  public void setAdtno(long adtno) {
    this.adtno = adtno;
  }


  public String getAdtypename() {
    return adtypename;
  }

  public void setAdtypename(String adtypename) {
    this.adtypename = adtypename;
  }


  public java.sql.Date getAddate() {
    return addate;
  }

  public void setAddate(java.sql.Date addate) {
    this.addate = addate;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Adtype{" +
            "adtno=" + adtno +
            ", adtypename='" + adtypename + '\'' +
            ", addate=" + addate +
            ", state='" + state + '\'' +
            '}';
  }
}

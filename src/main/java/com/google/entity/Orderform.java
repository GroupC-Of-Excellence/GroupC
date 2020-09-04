package com.google.entity;


import java.io.Serializable;

public class Orderform implements Serializable {

  private long orno;
  private long usno;
  private long addrno;
  private double totalprice;
  private double cheapprice;
  private java.sql.Date ordate;
  private long state;


  public long getOrno() {
    return orno;
  }

  public void setOrno(long orno) {
    this.orno = orno;
  }


  public long getUsno() {
    return usno;
  }

  public void setUsno(long usno) {
    this.usno = usno;
  }


  public long getAddrno() {
    return addrno;
  }

  public void setAddrno(long addrno) {
    this.addrno = addrno;
  }


  public double getTotalprice() {
    return totalprice;
  }

  public void setTotalprice(double totalprice) {
    this.totalprice = totalprice;
  }


  public double getCheapprice() {
    return cheapprice;
  }

  public void setCheapprice(double cheapprice) {
    this.cheapprice = cheapprice;
  }


  public java.sql.Date getOrdate() {
    return ordate;
  }

  public void setOrdate(java.sql.Date ordate) {
    this.ordate = ordate;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Orderform{" +
            "orno=" + orno +
            ", usno=" + usno +
            ", addrno=" + addrno +
            ", totalprice=" + totalprice +
            ", cheapprice=" + cheapprice +
            ", ordate=" + ordate +
            ", state=" + state +
            '}';
  }
}

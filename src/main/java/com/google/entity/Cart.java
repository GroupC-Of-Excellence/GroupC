package com.google.entity;


public class Cart {

  private long cano;
  private long usno;
  private double totalprice;
  private double cheapprice;
  private java.sql.Date cartdate;
  private long state;


  public long getCano() {
    return cano;
  }

  public void setCano(long cano) {
    this.cano = cano;
  }


  public long getUsno() {
    return usno;
  }

  public void setUsno(long usno) {
    this.usno = usno;
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


  public java.sql.Date getCartdate() {
    return cartdate;
  }

  public void setCartdate(java.sql.Date cartdate) {
    this.cartdate = cartdate;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Cart{" +
            "cano=" + cano +
            ", usno=" + usno +
            ", totalprice=" + totalprice +
            ", cheapprice=" + cheapprice +
            ", cartdate=" + cartdate +
            ", state=" + state +
            '}';
  }
}

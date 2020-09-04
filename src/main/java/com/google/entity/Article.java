package com.google.entity;


import java.io.Serializable;

public class Article implements Serializable {

  private long arno;
  private long arttno;
  private String total;
  private String brief;
  private java.sql.Date artdate;
  private long valu;
  private String state;


  public long getArno() {
    return arno;
  }

  public void setArno(long arno) {
    this.arno = arno;
  }


  public long getArttno() {
    return arttno;
  }

  public void setArttno(long arttno) {
    this.arttno = arttno;
  }


  public String getTotal() {
    return total;
  }

  public void setTotal(String total) {
    this.total = total;
  }


  public String getBrief() {
    return brief;
  }

  public void setBrief(String brief) {
    this.brief = brief;
  }


  public java.sql.Date getArtdate() {
    return artdate;
  }

  public void setArtdate(java.sql.Date artdate) {
    this.artdate = artdate;
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
    return "Article{" +
            "arno=" + arno +
            ", arttno=" + arttno +
            ", total='" + total + '\'' +
            ", brief='" + brief + '\'' +
            ", artdate=" + artdate +
            ", valu=" + valu +
            ", state='" + state + '\'' +
            '}';
  }
}

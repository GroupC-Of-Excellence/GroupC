package com.google.entity;


import java.io.Serializable;

public class Arttype implements Serializable {

  private long arttno;
  private String arttypename;
  private java.sql.Date artdate;
  private String state;


  public long getArttno() {
    return arttno;
  }

  public void setArttno(long arttno) {
    this.arttno = arttno;
  }


  public String getArttypename() {
    return arttypename;
  }

  public void setArttypename(String arttypename) {
    this.arttypename = arttypename;
  }


  public java.sql.Date getArtdate() {
    return artdate;
  }

  public void setArtdate(java.sql.Date artdate) {
    this.artdate = artdate;
  }


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Arttype{" +
            "arttno=" + arttno +
            ", arttypename='" + arttypename + '\'' +
            ", artdate=" + artdate +
            ", state='" + state + '\'' +
            '}';
  }
}

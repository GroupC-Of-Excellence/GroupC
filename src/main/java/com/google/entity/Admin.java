package com.google.entity;


import java.io.Serializable;

public class Admin implements Serializable {

  private long adno;
  private String aname;
  private String apwd;


  public long getAdno() {
    return adno;
  }

  public void setAdno(long adno) {
    this.adno = adno;
  }


  public String getAname() {
    return aname;
  }

  public void setAname(String aname) {
    this.aname = aname;
  }


  public String getApwd() {
    return apwd;
  }

  public void setApwd(String apwd) {
    this.apwd = apwd;
  }

  @Override
  public String toString() {
    return "Admin{" +
            "adno=" + adno +
            ", aname='" + aname + '\'' +
            ", apwd='" + apwd + '\'' +
            '}';
  }
}

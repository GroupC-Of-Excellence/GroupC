package com.google.entity;


import java.io.Serializable;

public class Gotype implements Serializable {

  private long gotpno;
  private String gotpname;
  private long gotppriority;
  private String gotpremarks;


  public long getGotpno() {
    return gotpno;
  }

  public void setGotpno(long gotpno) {
    this.gotpno = gotpno;
  }


  public String getGotpname() {
    return gotpname;
  }

  public void setGotpname(String gotpname) {
    this.gotpname = gotpname;
  }


  public long getGotppriority() {
    return gotppriority;
  }

  public void setGotppriority(long gotppriority) {
    this.gotppriority = gotppriority;
  }


  public String getGotpremarks() {
    return gotpremarks;
  }

  public void setGotpremarks(String gotpremarks) {
    this.gotpremarks = gotpremarks;
  }

  @Override
  public String toString() {
    return "Gotype{" +
            "gotpno=" + gotpno +
            ", gotpname='" + gotpname + '\'' +
            ", gotppriority=" + gotppriority +
            ", gotpremarks='" + gotpremarks + '\'' +
            '}';
  }
}

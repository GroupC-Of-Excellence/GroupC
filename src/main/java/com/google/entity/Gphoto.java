package com.google.entity;


import java.io.Serializable;

public class Gphoto implements Serializable {

  private long gpno;
  private long gono;
  private String picture;


  public long getGpno() {
    return gpno;
  }

  public void setGpno(long gpno) {
    this.gpno = gpno;
  }


  public long getGono() {
    return gono;
  }

  public void setGono(long gono) {
    this.gono = gono;
  }


  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  @Override
  public String toString() {
    return "Gphoto{" +
            "gpno=" + gpno +
            ", gono=" + gono +
            ", picture='" + picture + '\'' +
            '}';
  }
}

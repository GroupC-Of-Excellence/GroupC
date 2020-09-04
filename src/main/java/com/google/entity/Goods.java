package com.google.entity;


import java.io.Serializable;

public class Goods implements Serializable {

  private long gono;
  private long gotpno;
  private long brno;
  private long stno;
  private String goname;
  private long gonum;
  private String goarea;
  private String godesc;
  private String gomatarial;
  private double gopreprice;
  private double gonowprice;
  private String gocounty;
  private long state;
  private long gonowstate;
  private long gophotonum;


  public long getGono() {
    return gono;
  }

  public void setGono(long gono) {
    this.gono = gono;
  }


  public long getGotpno() {
    return gotpno;
  }

  public void setGotpno(long gotpno) {
    this.gotpno = gotpno;
  }


  public long getBrno() {
    return brno;
  }

  public void setBrno(long brno) {
    this.brno = brno;
  }


  public long getStno() {
    return stno;
  }

  public void setStno(long stno) {
    this.stno = stno;
  }


  public String getGoname() {
    return goname;
  }

  public void setGoname(String goname) {
    this.goname = goname;
  }


  public long getGonum() {
    return gonum;
  }

  public void setGonum(long gonum) {
    this.gonum = gonum;
  }


  public String getGoarea() {
    return goarea;
  }

  public void setGoarea(String goarea) {
    this.goarea = goarea;
  }


  public String getGodesc() {
    return godesc;
  }

  public void setGodesc(String godesc) {
    this.godesc = godesc;
  }


  public String getGomatarial() {
    return gomatarial;
  }

  public void setGomatarial(String gomatarial) {
    this.gomatarial = gomatarial;
  }


  public double getGopreprice() {
    return gopreprice;
  }

  public void setGopreprice(double gopreprice) {
    this.gopreprice = gopreprice;
  }


  public double getGonowprice() {
    return gonowprice;
  }

  public void setGonowprice(double gonowprice) {
    this.gonowprice = gonowprice;
  }


  public String getGocounty() {
    return gocounty;
  }

  public void setGocounty(String gocounty) {
    this.gocounty = gocounty;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public long getGonowstate() {
    return gonowstate;
  }

  public void setGonowstate(long gonowstate) {
    this.gonowstate = gonowstate;
  }


  public long getGophotonum() {
    return gophotonum;
  }

  public void setGophotonum(long gophotonum) {
    this.gophotonum = gophotonum;
  }

  @Override
  public String toString() {
    return "Goods{" +
            "gono=" + gono +
            ", gotpno=" + gotpno +
            ", brno=" + brno +
            ", stno=" + stno +
            ", goname='" + goname + '\'' +
            ", gonum=" + gonum +
            ", goarea='" + goarea + '\'' +
            ", godesc='" + godesc + '\'' +
            ", gomatarial='" + gomatarial + '\'' +
            ", gopreprice=" + gopreprice +
            ", gonowprice=" + gonowprice +
            ", gocounty='" + gocounty + '\'' +
            ", state=" + state +
            ", gonowstate=" + gonowstate +
            ", gophotonum=" + gophotonum +
            '}';
  }
}

package com.hotel.entity;

import java.util.Date;

public class Expenditure {

  private long expenditureId;
  private Date startdate;
  private long totalprice;
  private long proId;
  private long fuserId;


  public long getExpenditureId() {
    return expenditureId;
  }

  public void setExpenditureId(long expenditureId) {
    this.expenditureId = expenditureId;
  }


  public Date getStartdate() {
    return startdate;
  }

  public void setStartdate(Date startdate) {
    this.startdate = startdate;
  }


  public long getTotalprice() {
    return totalprice;
  }

  public void setTotalprice(long totalprice) {
    this.totalprice = totalprice;
  }


  public long getProId() {
    return proId;
  }

  public void setProId(long proId) {
    this.proId = proId;
  }


  public long getFuserId() {
    return fuserId;
  }

  public void setFuserId(long fuserId) {
    this.fuserId = fuserId;
  }

}

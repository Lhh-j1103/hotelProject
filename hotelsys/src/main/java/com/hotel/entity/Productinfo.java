package com.hotel.entity;


public class Productinfo {

  private long proId;
  private long proPrice;
  private String proIntro;
  private String proImage;
  private long proSalesVolume;
  private long proquantity;
  private long proTypeId;


  public long getProId() {
    return proId;
  }

  public void setProId(long proId) {
    this.proId = proId;
  }


  public long getProPrice() {
    return proPrice;
  }

  public void setProPrice(long proPrice) {
    this.proPrice = proPrice;
  }


  public String getProIntro() {
    return proIntro;
  }

  public void setProIntro(String proIntro) {
    this.proIntro = proIntro;
  }


  public String getProImage() {
    return proImage;
  }

  public void setProImage(String proImage) {
    this.proImage = proImage;
  }


  public long getProSalesVolume() {
    return proSalesVolume;
  }

  public void setProSalesVolume(long proSalesVolume) {
    this.proSalesVolume = proSalesVolume;
  }


  public long getProquantity() {
    return proquantity;
  }

  public void setProquantity(long proquantity) {
    this.proquantity = proquantity;
  }


  public long getProTypeId() {
    return proTypeId;
  }

  public void setProTypeId(long proTypeId) {
    this.proTypeId = proTypeId;
  }

}

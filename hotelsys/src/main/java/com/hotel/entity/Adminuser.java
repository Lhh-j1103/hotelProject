package com.hotel.entity;

import java.util.Date;

public class Adminuser {

  private long auserId;
  private String ausername;
  private String account;
  private String apwd;
  private String aIdCard;
  private String atelephone;
  private String asex;
  private long aage;
  private String aemail;
  private String aaddress;
  private long astatus;
  private long roleId;
  private Date acreateTime;


  public long getAuserId() {
    return auserId;
  }

  public void setAuserId(long auserId) {
    this.auserId = auserId;
  }


  public String getAusername() {
    return ausername;
  }

  public void setAusername(String ausername) {
    this.ausername = ausername;
  }


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }


  public String getApwd() {
    return apwd;
  }

  public void setApwd(String apwd) {
    this.apwd = apwd;
  }


  public String getAIdCard() {
    return aIdCard;
  }

  public void setAIdCard(String aIdCard) {
    this.aIdCard = aIdCard;
  }


  public String getAtelephone() {
    return atelephone;
  }

  public void setAtelephone(String atelephone) {
    this.atelephone = atelephone;
  }


  public String getAsex() {
    return asex;
  }

  public void setAsex(String asex) {
    this.asex = asex;
  }


  public long getAage() {
    return aage;
  }

  public void setAage(long aage) {
    this.aage = aage;
  }


  public String getAemail() {
    return aemail;
  }

  public void setAemail(String aemail) {
    this.aemail = aemail;
  }


  public String getAaddress() {
    return aaddress;
  }

  public void setAaddress(String aaddress) {
    this.aaddress = aaddress;
  }


  public long getAstatus() {
    return astatus;
  }

  public void setAstatus(long astatus) {
    this.astatus = astatus;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public Date getAcreateTime() {
    return acreateTime;
  }

  public void setAcreateTime(Date acreateTime) {
    this.acreateTime = acreateTime;
  }

}

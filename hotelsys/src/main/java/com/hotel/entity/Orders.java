package com.hotel.entity;

import java.util.Date;

public class Orders {

  private long ordersId;
  private long guestTypeId;
  private long guestNumber;
  private long ordersum;
  private long orderstatus;
  private Date reservetime;
  private Date checkintime;
  private Date dropouttime;
  private Date updatetime;
  private String updateInfo;
  private long updateId;
  private long fuserId;
  private long roomId;

  public long getOrdersId() {
    return ordersId;
  }

  public void setOrdersId(long ordersId) {
    this.ordersId = ordersId;
  }

  public long getGuestTypeId() {
    return guestTypeId;
  }

  public void setGuestTypeId(long guestTypeId) {
    this.guestTypeId = guestTypeId;
  }

  public long getGuestNumber() {
    return guestNumber;
  }

  public void setGuestNumber(long guestNumber) {
    this.guestNumber = guestNumber;
  }

  public long getOrdersum() {
    return ordersum;
  }

  public void setOrdersum(long ordersum) {
    this.ordersum = ordersum;
  }

  public long getOrderstatus() {
    return orderstatus;
  }

  public void setOrderstatus(long orderstatus) {
    this.orderstatus = orderstatus;
  }

  public Date getReservetime() {
    return reservetime;
  }

  public void setReservetime(Date reservetime) {
    this.reservetime = reservetime;
  }

  public Date getCheckintime() {
    return checkintime;
  }

  public void setCheckintime(Date checkintime) {
    this.checkintime = checkintime;
  }

  public Date getDropouttime() {
    return dropouttime;
  }

  public void setDropouttime(Date dropouttime) {
    this.dropouttime = dropouttime;
  }

  public Date getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(Date updatetime) {
    this.updatetime = updatetime;
  }

  public String getUpdateInfo() {
    return updateInfo;
  }

  public void setUpdateInfo(String updateInfo) {
    this.updateInfo = updateInfo;
  }

  public long getUpdateId() {
    return updateId;
  }

  public void setUpdateId(long updateId) {
    this.updateId = updateId;
  }

  public long getFuserId() {
    return fuserId;
  }

  public void setFuserId(long fuserId) {
    this.fuserId = fuserId;
  }

  public long getRoomId() {
    return roomId;
  }

  public void setRoomId(long roomId) {
    this.roomId = roomId;
  }
}

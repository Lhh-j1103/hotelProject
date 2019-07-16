package com.hotel.entity;


public class Guestroom {

  private Integer guestRoomId;
  private Integer roomStatus;
  private Integer guestTypeId;
  private GuestRoomType guestroomtype;

  public Integer getGuestRoomId() {
    return guestRoomId;
  }

  public void setGuestRoomId(Integer guestRoomId) {
    this.guestRoomId = guestRoomId;
  }

  public Integer getRoomStatus() {
    return roomStatus;
  }

  public void setRoomStatus(Integer roomStatus) {
    this.roomStatus = roomStatus;
  }

  public Integer getGuestTypeId() {
    return guestTypeId;
  }

  public void setGuestTypeId(Integer guestTypeId) {
    this.guestTypeId = guestTypeId;
  }

  public GuestRoomType getGuestroomtype() {
    return guestroomtype;
  }

  public void setGuestroomtype(GuestRoomType guestroomtype) {
    this.guestroomtype = guestroomtype;
  }
}



package com.hotel.entity;


public class GuestRoomType {

  private Integer guestTypeId;
  private String guestTypeName;
  private Integer quantity;
  private String guestInfo;
  private Integer guestPrice;
  private String guestImage;

  public Integer getGuestTypeId() {
    return guestTypeId;
  }

  public void setGuestTypeId(Integer guestTypeId) {
    this.guestTypeId = guestTypeId;
  }

  public String getGuestTypeName() {
    return guestTypeName;
  }

  public void setGuestTypeName(String guestTypeName) {
    this.guestTypeName = guestTypeName;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public String getGuestInfo() {
    return guestInfo;
  }

  public void setGuestInfo(String guestInfo) {
    this.guestInfo = guestInfo;
  }

  public Integer getGuestPrice() {
    return guestPrice;
  }

  public void setGuestPrice(Integer guestPrice) {
    this.guestPrice = guestPrice;
  }

  public String getGuestImage() {
    return guestImage;
  }

  public void setGuestImage(String guestImage) {
    this.guestImage = guestImage;
  }
}

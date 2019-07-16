package com.hotel.entity;


public class Permission {

  private long perId;
  private String permissionName;
  private long roleId;


  public long getPerId() {
    return perId;
  }

  public void setPerId(long perId) {
    this.perId = perId;
  }


  public String getPermissionName() {
    return permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }

}

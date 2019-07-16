package com.hotel.service;

import com.hotel.entity.Guestroom;

import java.util.List;

public interface GuestRoomService {
   /**
     * 查询客房列表
     * @return
     */
    List<Guestroom> findGuestRoom();
}

package com.hotel.dao;

import com.hotel.entity.Guestroom;

import java.util.List;

/**
 * GuestRoom接口
 */
public interface GuestRoomMapper  {

    /**
     * 查询客房列表
     * @return
     */
    List<Guestroom> findGuestRoom();

}

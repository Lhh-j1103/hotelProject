package com.hotel.service.impl;

import com.hotel.dao.GuestRoomMapper;
import com.hotel.entity.Guestroom;
import com.hotel.service.GuestRoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GuestRoomServiceImpl implements GuestRoomService {

    @Resource
    private GuestRoomMapper guestRoomMapper;

    @Override
    public List<Guestroom> findGuestRoom() {
        return guestRoomMapper.findGuestRoom();
    }
}

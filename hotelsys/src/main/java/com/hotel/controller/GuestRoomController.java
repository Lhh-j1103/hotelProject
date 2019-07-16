package com.hotel.controller;

import com.hotel.service.GuestRoomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class GuestRoomController {

    @Resource
    private GuestRoomService guestRoomService;

    @RequestMapping("/index.html")
    public String toLogin(Model model){
        model.addAttribute("guestRoomList",guestRoomService.findGuestRoom());
        return "index";
    }


}

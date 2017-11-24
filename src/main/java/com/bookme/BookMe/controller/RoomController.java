package com.bookme.BookMe.controller;

import com.bookme.BookMe.model.Hotel;
import com.bookme.BookMe.model.Room;
import com.bookme.BookMe.service.HotelService;
import com.bookme.BookMe.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/dashboard")
public class RoomController {
    private static final String ROOM_LIST = "rooms";

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/listRooms", method = RequestMethod.GET)
    public String index(@RequestParam("hotelId") int hotelId, Model model) {
        List<Room> rooms = roomService.getAllByHotelId(hotelId);
        model.addAttribute("roomList", rooms);

        return ROOM_LIST;
    }
}

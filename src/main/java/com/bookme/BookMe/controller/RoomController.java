package com.bookme.BookMe.controller;

import com.bookme.BookMe.model.Room;
import com.bookme.BookMe.service.HotelService;
import com.bookme.BookMe.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/hotel")
public class RoomController {
    private static final String ROOM_LIST = "proba";
    private static final String ROOM = "proba2";

    @Autowired
    private RoomService roomService;
    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = "/listRooms", method = RequestMethod.GET)
    public String listRooms(@RequestParam("hotelName") String name, Model model) {

        List<Room> rooms = roomService.getAllByHotelIdNameAndAvailability(name, true);
        model.addAttribute("roomList", rooms);
        model.addAttribute("hotel", hotelService.getByName(name));

        return ROOM_LIST;
    }

    @RequestMapping(value = "/{id}/room", method = RequestMethod.GET)
    public String getRoom(@PathVariable("id") int roomId, Model model) {
        Room room = roomService.findByRoomId(roomId);
        model.addAttribute("room", room);
        return ROOM;
    }


}

package com.bookme.BookMe.controller;

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
@RequestMapping(value = "/list")
public class RoomController {
    private static final String ROOM_LIST = "rooms";
    private static final String ROOM = "roomOrder";

    @Autowired
    private RoomService roomService;
    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public String listRooms(@RequestParam("hotelName") String name, Model model) {

        List<Room> rooms = roomService.getAllByHotelIdNameAndAvailability(name, true);
        model.addAttribute("roomList", rooms);
        model.addAttribute("hotel", hotelService.getByName(name));

        return ROOM_LIST;
    }

    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public String getRoom(@RequestParam("id") int roomId, Model model) {
        /**
         * TODO: Matija treba napraviti controller za prikazivanje jedne sobe
         */
        return ROOM;
    }


}

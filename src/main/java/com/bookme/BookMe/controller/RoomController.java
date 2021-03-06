package com.bookme.BookMe.controller;

import com.bookme.BookMe.model.Date;
import com.bookme.BookMe.model.Room;
import com.bookme.BookMe.model.RoomPhotos;
import com.bookme.BookMe.model.RoomUnavailability;
import com.bookme.BookMe.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/list")
public class RoomController {
    private static final String ROOM_LIST = "rooms";
    private static final String ROOM = "roomOrder";

    @Autowired
    private RoomService roomService;
    @Autowired
    private RoomPhotosService roomPhotosService;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private DateService dateService;
    @Autowired
    private RoomUnavailabilityService unavailabilityService;


    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public String listRooms(@RequestParam("hotelName") String name, @RequestParam("checkIn") String checkIn, @RequestParam("checkOut") String checkOut, @RequestParam("numPeople") int numPeople, Model model) {

        int checkInYear = Integer.parseInt(checkIn.substring(0, 4));
        int checkInMonth = Integer.parseInt(checkIn.substring(5, 7));
        int checkInDay = Integer.parseInt(checkIn.substring(8, 10));

        int checkOutYear = Integer.parseInt(checkOut.substring(0, 4));
        int checkOutMonth = Integer.parseInt(checkOut.substring(5, 7));
        int checkOutDay = Integer.parseInt(checkOut.substring(8, 10));
        int hotelId = hotelService.getByName(name).getHotelId();
        List<Room> rooms = roomService.findAvailableRoomsinHotelByDate(hotelId, numPeople, checkOutYear, checkOutMonth, checkOutDay, checkInYear, checkInMonth, checkInDay);
        model.addAttribute("roomList", rooms);
        model.addAttribute("checkIn", checkIn);
        model.addAttribute("checkOut", checkOut);
        model.addAttribute("hotel", hotelService.getByName(name));

        return ROOM_LIST;
    }

    @RequestMapping(value = "/room", method = RequestMethod.GET)
    public String getRoom(@RequestParam("id") int roomId, @RequestParam("checkIn") String checkIn, @RequestParam("checkOut") String checkOut, Model model) {
        List<Room> room = roomService.getAllByRoomId(roomId);
        model.addAttribute("roomDetails", room);
        model.addAttribute("checkIn", checkIn);
        model.addAttribute("checkOut", checkOut);
        return ROOM;
    }

    @RequestMapping(value = "/reserve", method = RequestMethod.GET)
    public String save(@RequestParam("roomId") int roomId, @RequestParam("checkIn") String checkIn, @RequestParam("checkOut") String checkOut, Model model) {

        int checkInYear = Integer.parseInt(checkIn.substring(0, 4));
        int checkInMonth = Integer.parseInt(checkIn.substring(5, 7));
        int checkInDay = Integer.parseInt(checkIn.substring(8, 10));
        Date checkInDate = new Date(45645, checkInYear, checkInDay, checkInMonth);

        int checkOutYear = Integer.parseInt(checkOut.substring(0, 4));
        int checkOutMonth = Integer.parseInt(checkOut.substring(5, 7));
        int checkOutDay = Integer.parseInt(checkOut.substring(8, 10));
        Date checkOutDate = new Date(654654, checkOutYear, checkOutDay, checkOutMonth);

        dateService.save(checkInDate);
        dateService.save(checkOutDate);
        Room room = roomService.findByRoomId(roomId);
        RoomUnavailability reservedRoom = new RoomUnavailability(4343, room, checkInDate, checkOutDate);
        unavailabilityService.save(reservedRoom);
        return ROOM;
    }

    @RequestMapping(value = "/roomImages", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody
    byte[] showImageOnRoomID(@RequestParam("roomId") int roomId) {

        List<RoomPhotos> photos = roomPhotosService.getRoomPhotosByRoomID(roomId);
        RoomPhotos roomPhotos = photos.get(0);
        byte[] img = roomPhotos.getPhoto();
        return img;
    }
}
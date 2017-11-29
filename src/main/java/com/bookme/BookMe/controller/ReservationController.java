package com.bookme.BookMe.controller;

import com.bookme.BookMe.model.Date;
import com.bookme.BookMe.model.Room;
import com.bookme.BookMe.model.RoomUnavailability;
import com.bookme.BookMe.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class ReservationController {

    private UserForm userForm;

    @RequestMapping(value = "/reserve", method = RequestMethod.GET)
    public String user(UserForm userForm) {
        return "reservation";
    }

    @RequestMapping(value = "/reserve", method = RequestMethod.POST)
    public String getUserInfo(@Valid UserForm userForm1, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "roomOrder";
        }
        userForm.setFirstName(userForm1.getFirstName());
        userForm.setLastName(userForm1.getLastName());
        userForm.setId_num(userForm1.getId_num());
        userForm.setPassportNum(userForm1.getPassportNum());
        userForm.setEmail(userForm1.getEmail());


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

}

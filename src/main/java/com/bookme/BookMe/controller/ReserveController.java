package com.bookme.BookMe.controller;

import com.bookme.BookMe.model.*;
import com.bookme.BookMe.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Controller
public class ReserveController {

    @Autowired
    private DateService dateService;
    @Autowired
    private RoomService roomService;
    @Autowired
    private RoomUnavailabilityService unavailabilityService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private UserService userService;
    @Autowired
    private BookingService bookingService;


    private UserForm userForm = new UserForm();
    private int roomID;
    private String checkIN;
    private String checkOUT;

    @RequestMapping(value = "/userForm", method = RequestMethod.GET)
    public String userForm(UserForm userForm, @RequestParam("roomId") int roomId, @RequestParam("checkIn") String checkIn, @RequestParam("checkOut") String checkOut) {
        roomID = roomId;
        checkIN = checkIn;
        checkOUT = checkOut;
        return "userForm";
    }

    @RequestMapping(value = "/reserve", method = RequestMethod.POST)
    public String getUserInfo(@Valid UserForm userForm1, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "roomOrder";
        }
        userForm.setfirstName(userForm1.getfirstName());
        userForm.setlastName(userForm1.getlastName());
        userForm.setId_num(userForm1.getId_num());
        userForm.setPassportNum(userForm1.getPassportNum());
        userForm.setEmail(userForm1.getEmail());
        userForm.setCountryAbbr(userForm1.getCountryAbbr());
        userForm.setTitle(userForm1.getTitle());

        return "redirect:/reserve?roomId=" + roomID + "&checkIn=" + checkIN + "&checkOut=" + checkOUT;
    }


    @RequestMapping(value = "/reserve", method = RequestMethod.GET)
    public String save(@RequestParam("roomId") int roomId, @RequestParam("checkIn") String checkIn, @RequestParam("checkOut") String checkOut, Model model) {

        int checkInYear = Integer.parseInt(checkIn.substring(0, 4));
        int checkInMonth = Integer.parseInt(checkIn.substring(5, 7));
        int checkInDay = Integer.parseInt(checkIn.substring(8, 10));
        Date checkInDate = new Date(checkInYear, checkInDay, checkInMonth);

        int checkOutYear = Integer.parseInt(checkOut.substring(0, 4));
        int checkOutMonth = Integer.parseInt(checkOut.substring(5, 7));
        int checkOutDay = Integer.parseInt(checkOut.substring(8, 10));
        Date checkOutDate = new Date(checkOutYear, checkOutDay, checkOutMonth);

        //save checkIn and checkOut dates
        dateService.save(checkInDate);
        dateService.save(checkOutDate);
        //make room unavailable
        Room room = roomService.findByRoomId(roomId);
        RoomUnavailability reservedRoom = new RoomUnavailability(room, checkInDate, checkOutDate);
        unavailabilityService.save(reservedRoom);

        //save user
        Country country = countryService.getByCountryAbbr("NE");
        PaymentMethod paymentMethod = paymentService.getByPaymentName("credit card");
        User newUser = new User(userForm.getfirstName(), userForm.getlastName(), userForm.getEmail(), country, userForm.getPassportNum(), userForm.getId_num(), paymentMethod, userForm.getTitle());
        userService.save(newUser);

        //save booking
        Hotel hotel = room.getHotelId();

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        java.util.Date date = new java.util.Date();
        dateFormat.format(date);
        int year = date.getYear();
        int month = date.getMonth();
        int day = date.getDay();

        Date bookingDate = new Date(year, month, day);
        dateService.save(bookingDate);

        Booking newBooking = new Booking(newUser, hotel, bookingDate, checkInDate, checkOutDate);
        bookingService.save(newBooking);
        return "roomOrder";


    }

}
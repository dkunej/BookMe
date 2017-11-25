package com.bookme.BookMe.controller;

import com.bookme.BookMe.model.Hotel;
import com.bookme.BookMe.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "/dashboard")
public class HotelController {

    private static final String HOTEL_LIST = "hotels";

    @Autowired
    private HotelService hotelService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index(@RequestParam("city") String city, Model model) {
        //@RequestParam String city
        //Address address = new Address(id);
        List<Hotel> hotels = hotelService.getAllByAddressCity(city);
        model.addAttribute("hotelList", hotels);

        return HOTEL_LIST;
    }
}
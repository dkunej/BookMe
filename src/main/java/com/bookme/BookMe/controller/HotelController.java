package com.bookme.BookMe.controller;

import com.bookme.BookMe.model.Form;
import com.bookme.BookMe.model.Hotel;
import com.bookme.BookMe.repository.HotelRepository;
import com.bookme.BookMe.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HotelController {

    private static final String HOTEL_LIST = "hotels";

    @Autowired
    private HotelService hotelService;
    @Autowired
    private HotelRepository hotelRepository;

    private Form form = new Form();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Form form) {
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String getHotelList(@Valid Form form1, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "index";
        }
        form.setCity(form1.getCity());
        form.setParking(form1.isParking());
        form.setSpa(form1.isSpa());
        form.setDryCleaning(form1.isDryCleaning());
        form.setPool(form1.isPool());
        form.setShuttleService(form1.isShuttleService());
        form.setWifi(form1.isWifi());
        form.setCheckinDate(form1.getCheckinDate());
        form.setCheckoutDate(form1.getCheckoutDate());
        form.setNumPeople(form1.getNumPeople());
        form.setStars(form1.getStars());

        return "redirect:/list?city=" + form1.getCity() + "&stars=" + form1.getStars() + "&numPeople=" + form1.getNumPeople();

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getHotelList(@RequestParam("city") String city, @RequestParam("stars") int stars, Model model) {

        List<Hotel> hotels = hotelService.getAllByAddressCityAndStars(city, stars);
        if (form.isParking()) {
            hotels = hotels.stream()
                    .filter(x -> (x.getHotelAmenities().isParking()))
                    .collect(Collectors.toList());
        }
        if (form.isSpa()) {
            hotels = hotels.stream()
                    .filter(x -> (x.getHotelAmenities().isSpa()))
                    .collect(Collectors.toList());
        }
        if (form.isPool()) {
            hotels = hotels.stream()
                    .filter(x -> (x.getHotelAmenities().isPool()))
                    .collect(Collectors.toList());
        }
        if (form.isDryCleaning()) {
            hotels = hotels.stream()
                    .filter(x -> (x.getHotelAmenities().isDryCleaning()))
                    .collect(Collectors.toList());
        }
        if (form.isShuttleService()) {
            hotels = hotels.stream()
                    .filter(x -> (x.getHotelAmenities().isShuttleService()))
                    .collect(Collectors.toList());
        }
        if (form.isWifi()) {
            hotels = hotels.stream()
                    .filter(x -> (x.getHotelAmenities().isWifi()))
                    .collect(Collectors.toList());
        }

        model.addAttribute("city", city);
        model.addAttribute("checkIn", form.getCheckinDate());
        model.addAttribute("checkOut", form.getCheckoutDate());
        model.addAttribute("hotelList", hotels);
        model.addAttribute("numPeople", form.getNumPeople());
        return HOTEL_LIST;
    }

    @RequestMapping(value = "/images", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody
    byte[] showImageOnId(@RequestParam("id") int id, @RequestParam("city") String city, @RequestParam("stars") int stars) {
        List<Hotel> hotels = hotelService.getAllByAddressCityAndStars(city, stars);
        byte[] img = hotels.get(id).getImage();
        return img;
    }
}
package controller;

import model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.HotelService;

import java.util.List;

@Controller
@RequestMapping(path = "/dashboard")
public class HotelController {

    private static final String HOTEL_LIST = "hotelList";

    @Autowired
    private HotelService hotelService;

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String index(@RequestParam String city, Model model) {

        List<Hotel> hotels = hotelService.getAllByAddress_City(city);

        model.addAttribute("hotelList", hotels);
        return HOTEL_LIST;
    }
}
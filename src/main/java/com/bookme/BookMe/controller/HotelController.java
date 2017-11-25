package com.bookme.BookMe.controller;

import com.bookme.BookMe.model.Hotel;
import com.bookme.BookMe.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    // http://localhost:8080/dashboard/get/image?id=1 works only image loading
    @RequestMapping(value = "/get/image", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    public @ResponseBody
    byte[] showImageOnId(@RequestParam("id") int id, Model model) {
        Address address = new Address(id);
        hotelService.equals(null);
        List<Hotel> hotels = hotelService.getAllByAddress(address);
        byte[] image = hotels.get(0).getImage();
        //model.addAttribute("image", image);
        return image;
    }

    //Not working

    /*@RequestMapping(value = "/image", produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<byte[]> getImage(@RequestParam("image_id") int imageId, Model model) throws IOException {
        hotelService = null;
        Address address = new Address(imageId);
        List<Hotel> hotels = hotelService.getAllByAddress(address);
        byte[] imageContent = hotels.get(0).getImage();
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_PNG);
        model.addAttribute("images", headers);
        return new ResponseEntity<byte[]>(imageContent, headers, HttpStatus.OK);
    }*/
}
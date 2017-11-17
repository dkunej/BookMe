package controller;

import model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.RoomService;

import java.util.List;

@Controller
@RequestMapping(path = "/dashboard")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping(path = "/available-rooms")
    public String index(@RequestParam boolean isAvailable) {
        List<Room> rooms = roomService.getAllByAvailability(isAvailable);
        return rooms.toString();
    }

}
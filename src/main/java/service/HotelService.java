package service;

import model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getAllByHotelName(String name);

    List<Hotel> getAllByCheckinStartDateId_fkAndCheckinEndDateId_fk(int startDate, int endDate);

    List<Hotel> getAllByAddress_City(String address);
}

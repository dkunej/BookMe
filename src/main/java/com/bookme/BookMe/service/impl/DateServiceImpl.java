package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.Date;
import com.bookme.BookMe.repository.DateRepository;
import com.bookme.BookMe.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Daniela on 12-Nov-17.
 */
@Service
public class DateServiceImpl implements DateService {

    @Autowired
    private DateRepository dateRepository;

    @Override
    public Date getByYearAndDayAndMonth(int year, int day, int month) {
        return dateRepository.getByYearAndDayAndMonth(year, day, month);
    }

    @Override
    public void save(Date d) {
        dateRepository.save(d);
    }
}

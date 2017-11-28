package com.bookme.BookMe.service;

import com.bookme.BookMe.model.Date;

/**
 * Created by Daniela on 12-Nov-17.
 */
public interface DateService {
    Date getByYearAndDayAndMonth(int year, int day, int month);

    Date save(Date d);
}
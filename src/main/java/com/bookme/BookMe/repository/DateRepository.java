package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Daniela on 12-Nov-17.
 */
@Repository
public interface DateRepository extends JpaRepository<Date, Long> {
    Date getByYearAndDayAndMonth(int year, int day, int month);
}

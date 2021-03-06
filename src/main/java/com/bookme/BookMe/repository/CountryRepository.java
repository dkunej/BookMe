package com.bookme.BookMe.repository;

import com.bookme.BookMe.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Daniela on 12-Nov-17.
 */

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Country getByCountryAbbr(String abbr);

    Country getByCountryName(String name);

}

package com.bookme.BookMe.service.impl;

import com.bookme.BookMe.model.Country;
import com.bookme.BookMe.repository.CountryRepository;
import com.bookme.BookMe.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Daniela on 12-Nov-17.
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country getByCountryAbbr(String abbr) {
        return countryRepository.getByCountryAbbr(abbr);
    }

    @Override
    public Country getByCountryName(String name) {
        return countryRepository.getByCountryName(name);
    }
}

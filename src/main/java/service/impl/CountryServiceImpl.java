package service.impl;

import model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CountryRepository;
import service.CountryService;

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
}

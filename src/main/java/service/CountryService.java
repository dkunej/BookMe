package service;

import model.Country;

/**
 * Created by Daniela on 12-Nov-17.
 */
public interface CountryService {
    Country getByCountryAbbr(String abbr);
}

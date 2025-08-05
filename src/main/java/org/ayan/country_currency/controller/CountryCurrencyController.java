package org.ayan.country_currency.controller;

import lombok.extern.slf4j.Slf4j;
import org.ayan.country_currency.dto.CountryCurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@CrossOrigin
@RestController
public class CountryCurrencyController {
    String API_URL = "https://restcountries.com/v3.1/all?fields=currencies";
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/country-currencies")
    public CountryCurrency[] getExternalData() {
        log.info("Received request to fetch country currencies");
        return restTemplate.getForObject(API_URL, CountryCurrency[].class);
    }
}

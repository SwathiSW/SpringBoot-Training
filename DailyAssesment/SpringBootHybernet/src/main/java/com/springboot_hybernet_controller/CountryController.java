package com.springboot_hybernet_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot_hybernet.Country;
import com.springboot_hybernet_repository.CountryRepository;

@Controller
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;
 
    @GetMapping("/country")
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
 
    @PostMapping("/country/blank")
    public Country addBlankCountries() {
        return countryRepository.save(new Country());
    }

    @PostMapping("/country")
    public Country addCountries(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    @PutMapping("/country")
    public Country updateCountries(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    @DeleteMapping("/country")
    public String deleteCountries(@RequestBody Country country) {
        countryRepository.delete(country);
        return "Deleted Successfully";
    }
}

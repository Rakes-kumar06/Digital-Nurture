package com.cognizant.spring_learn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.Country;

@Service
public class CountryService {

    public Country getCountry(String code) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countries = new ArrayList<>();

        countries.add(context.getBean("in", Country.class));
        countries.add(context.getBean("us", Country.class));
        countries.add(context.getBean("de", Country.class));
        countries.add(context.getBean("jp", Country.class));

        return countries.stream()
                .filter(country ->
                        country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
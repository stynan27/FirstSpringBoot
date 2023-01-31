package com.seamus.springboot.learnspringboot;

import java.lang.module.Configuration;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyConfigurationController {

    // field-based dependency injection of CurrencyServiceConfiguration
    @Autowired
    private CurrencyServiceConfiguration configuration;

    // Map URL request to a method
    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration retrieveConfiguration() {
        return configuration;
    }
}

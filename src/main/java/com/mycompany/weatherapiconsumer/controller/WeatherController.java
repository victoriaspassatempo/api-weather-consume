package com.mycompany.weatherapiconsumer.controller;

import com.mycompany.weatherapiconsumer.service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/")
public class WeatherController {
    private static final Logger logger = LoggerFactory.getLogger(WeatherController.class); //definindo log
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/{city}")
    public Object[] getWeather(@PathVariable("city") String city) {
        logger.info("Recebendo solicitação, {}", city);

        String encodedCity = UriComponentsBuilder.fromUriString(city).build().toUriString();
        return weatherService.getWeather(encodedCity);
    }

}

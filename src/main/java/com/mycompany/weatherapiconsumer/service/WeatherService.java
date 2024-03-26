package com.mycompany.weatherapiconsumer.service;


import com.mycompany.weatherapiconsumer.controller.WeatherController;
import com.mycompany.weatherapiconsumer.model.WeatherDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherService {
    @Value("${api.key}")
    private String apiKey;

    RestTemplate restTemplate = new RestTemplate();

    private static final Logger logger = LoggerFactory.getLogger(WeatherController.class);


    public Object[] getWeather(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=" + apiKey; //formatando url para passar os parametros

        String encodedUrl = UriComponentsBuilder.fromUriString(url).build().toUriString(); // utilizando encode, pois a API necessita dessa funcionalidade para definir a cidade

        logger.info("URL da requisição: {}", encodedUrl);

        Object[] response = new WeatherDTO[]{restTemplate.getForObject(encodedUrl, WeatherDTO.class)};

        logger.info("Resposta da API: {}", response);

        return new Object[]{response};

    }

}

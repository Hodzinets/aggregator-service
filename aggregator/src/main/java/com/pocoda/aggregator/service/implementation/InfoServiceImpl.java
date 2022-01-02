package com.pocoda.aggregator.service.implementation;

import com.pocoda.aggregator.model.response.InfoResponse;
import com.pocoda.aggregator.model.response.WeatherResponse;
import com.pocoda.aggregator.service.InfoService;
import com.pocoda.aggregator.service.web.PollutionWebService;
import com.pocoda.aggregator.service.web.WeatherWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private WeatherWebService weatherWebService;
    @Autowired
    private PollutionWebService pollutionService;

    @Override
    public InfoResponse getInfo(String city) {
        var weather = weatherWebService.getWeather(city);
        var pollution = pollutionService.getPollution(city);

        return InfoResponse.builder()
                .pollution(pollution)
                .weather(WeatherResponse.builder()
                        .location(weather.location.name + ", " + weather.location.country)
                        .temp(weather.current.temp_c)
                        .condition(weather.current.condition.text)
                        .build()).build();
    }
}

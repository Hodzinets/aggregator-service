package com.pocoda.aggregator.controller;

import com.pocoda.aggregator.model.request.TestRequest;
import com.pocoda.aggregator.service.web.WeatherWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private WeatherWebService weatherWebService;

    @GetMapping("/test")
    public String test() {
        return "Hello PoCoda Aggregator!";
    }

    @GetMapping("/test/weather")
    public String testWeather() {
        return weatherWebService.testGet();
    }

    @PostMapping("/test/weather")
    public ResponseEntity testWeatherPost(@RequestBody TestRequest request) {
        weatherWebService.testPost(request);
        return ResponseEntity.ok().build();
    }
}

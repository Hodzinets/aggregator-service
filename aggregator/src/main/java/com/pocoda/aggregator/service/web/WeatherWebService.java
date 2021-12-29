package com.pocoda.aggregator.service.web;

import com.pocoda.aggregator.model.request.TestRequest;
import com.pocoda.aggregator.model.response.WeatherWebResponse;

public interface WeatherWebService {
    String testGet();

    void testPost(TestRequest request);

    WeatherWebResponse getWeather(String city);
}

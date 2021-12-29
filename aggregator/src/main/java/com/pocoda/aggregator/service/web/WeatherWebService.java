package com.pocoda.aggregator.service.web;

import com.pocoda.aggregator.model.request.TestRequest;

public interface WeatherWebService {
    String testGet();

    void testPost(TestRequest request);
}

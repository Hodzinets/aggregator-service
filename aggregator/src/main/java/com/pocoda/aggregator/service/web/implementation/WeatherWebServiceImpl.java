package com.pocoda.aggregator.service.web.implementation;

import com.pocoda.aggregator.model.request.TestRequest;
import com.pocoda.aggregator.model.response.WeatherWebResponse;
import com.pocoda.aggregator.service.web.WeatherWebService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherWebServiceImpl implements WeatherWebService {
    @Autowired
    private RestTemplate restTemplate;

    private String ulr = "http://weather-service/";

    @Override
    public String testGet() {
        return restTemplate.getForObject(ulr + "test", String.class);
    }

    @Override
    public void testPost(TestRequest request) {
        HttpEntity<TestRequest> requestEntity = new HttpEntity(request, new HttpHeaders());
        HttpEntity response = restTemplate.exchange(ulr + "test", HttpMethod.POST, requestEntity, String.class);
    }

    @Override
    public WeatherWebResponse getWeather(String city) {
        if(StringUtils.isEmpty(city)) {
            city = "KRAKOW";
        }
        String weatherUrl = ulr + "/weather?city={0}";
        return this.restTemplate.getForObject(weatherUrl, WeatherWebResponse.class, city);
    }
}

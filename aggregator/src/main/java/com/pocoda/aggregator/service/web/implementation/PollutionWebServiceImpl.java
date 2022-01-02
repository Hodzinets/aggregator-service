package com.pocoda.aggregator.service.web.implementation;

import com.pocoda.aggregator.model.response.PollutionWebResponse;
import com.pocoda.aggregator.service.web.PollutionWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PollutionWebServiceImpl implements PollutionWebService {
    @Autowired
    private RestTemplate restTemplate;

    private String ulr = "http://air-info-server/";

    @Override
    public PollutionWebResponse getPollution(String city) {
//        if(StringUtils.isEmpty(city)) {
//            city = "KRAKOW";
//        }
        String weatherUrl = ulr + "/current";
        return this.restTemplate.getForObject(weatherUrl, PollutionWebResponse.class, city);
    }
}

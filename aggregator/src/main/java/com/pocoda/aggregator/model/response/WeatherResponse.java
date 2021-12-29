package com.pocoda.aggregator.model.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class WeatherResponse {
    private String location;
    private double temp;
    private String condition;
}

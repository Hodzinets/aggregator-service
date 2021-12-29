package com.pocoda.aggregator.model.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class InfoResponse {
    private WeatherResponse weather;
}

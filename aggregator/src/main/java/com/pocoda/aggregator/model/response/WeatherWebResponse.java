package com.pocoda.aggregator.model.response;

import com.pocoda.aggregator.model.response.weather.Current;
import com.pocoda.aggregator.model.response.weather.Location;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherWebResponse {
    public Location location;
    public Current current;
}

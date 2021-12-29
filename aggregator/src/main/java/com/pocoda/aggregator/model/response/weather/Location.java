package com.pocoda.aggregator.model.response.weather;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location{
    public String name;
    public String region;
    public String country;
}

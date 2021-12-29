package com.pocoda.aggregator.model.response.weather;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Condition{
    public String text;
    public String icon;
    public int code;
}

package com.pocoda.aggregator.model.response;

import com.pocoda.aggregator.model.response.pollution.PollutionModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PollutionWebResponse {
    private PollutionModel pm10;
    private PollutionModel pm25;
    boolean matchesNorms = true;
}

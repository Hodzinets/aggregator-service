package com.pocoda.aggregator.service.web;

import com.pocoda.aggregator.model.response.PollutionWebResponse;

public interface PollutionWebService {
    PollutionWebResponse getPollution(String city);
}

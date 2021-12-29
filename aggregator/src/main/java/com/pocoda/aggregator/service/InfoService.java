package com.pocoda.aggregator.service;

import com.pocoda.aggregator.model.response.InfoResponse;

public interface InfoService {
    InfoResponse getInfo(String city);
}

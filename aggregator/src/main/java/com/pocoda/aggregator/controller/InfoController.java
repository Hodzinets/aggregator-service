package com.pocoda.aggregator.controller;

import com.pocoda.aggregator.model.response.InfoResponse;
import com.pocoda.aggregator.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("info")
public class InfoController {
    @Autowired
    private InfoService infoService;

    @GetMapping
    public ResponseEntity<InfoResponse> getInfo(@RequestParam(value = "city", required = false) String city) {
        var result = infoService.getInfo(city);
        return ResponseEntity.ok(result);
    }
}

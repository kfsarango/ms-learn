package com.in28minutes.mircoservices.limitsservice.controller;

import com.in28minutes.mircoservices.limitsservice.bean.Limits;
import com.in28minutes.mircoservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration  configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimun(), configuration.getMaximun());
    }
}

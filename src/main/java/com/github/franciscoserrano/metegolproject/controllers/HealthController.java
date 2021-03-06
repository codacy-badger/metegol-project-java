package com.github.franciscoserrano.metegolproject.controllers;

import com.github.franciscoserrano.metegolproject.services.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    private final HealthService healthService;

    @Autowired
    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping
    public String healthCheck() {
        return this.healthService.check();
    }
}

package com.example.foo_parameterization.controller;

import com.example.foo_parameterization.service.VolumeCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class VolumeController {
    @Autowired
    private VolumeCalculator volumeCalculator;

    @GetMapping("/volume")
    public double getVolume(@RequestParam double radius) {
        return volumeCalculator.calculateSphereVolume(radius);
    }
}

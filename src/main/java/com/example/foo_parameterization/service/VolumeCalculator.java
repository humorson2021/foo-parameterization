package com.example.foo_parameterization.service;

import org.springframework.stereotype.Service;

@Service
public class VolumeCalculator {
    public double calculateSphereVolume(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

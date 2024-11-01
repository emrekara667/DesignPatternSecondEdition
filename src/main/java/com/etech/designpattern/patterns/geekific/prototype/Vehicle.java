package com.etech.designpattern.patterns.geekific.prototype;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Vehicle {
    private final String brand;
    private final String model;
    private final String color;

    protected Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.color = vehicle.color;
    }

    public Vehicle(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public abstract Vehicle clone();
}

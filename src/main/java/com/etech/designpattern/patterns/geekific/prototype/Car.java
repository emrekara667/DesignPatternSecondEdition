package com.etech.designpattern.patterns.geekific.prototype;

import lombok.ToString;

@ToString(callSuper = true)
public class Car extends Vehicle {
    private final int topSeed;
    //private final GpsSystem gpsSystem;


    public Car(String brand, String model, String color, int topSeed) {
        super(brand, model, color);
        this.topSeed = topSeed;
    }

    public Car(Car car) {
        super(car);
        this.topSeed = car.topSeed;
        //this.gpsSystem = new GpsSystem();
                //or gpsSystem.clone();
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}

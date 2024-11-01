package com.etech.designpattern.patterns.geekific.prototype;

import lombok.ToString;

@ToString(callSuper = true)
public class Bus extends Vehicle{

    private final int doors;

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    public Bus(String brand, String model, String color, int doors) {
        super(brand, model, color);
        this.doors = doors;
    }

    @Override
    public Bus clone(){
        return new Bus(this);
    }
}

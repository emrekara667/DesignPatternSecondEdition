package com.etech.designpattern.patterns.geekific.command.components;

public class FloorLamp extends Component{
    private final Light light;

    public FloorLamp() {
        this.light = new Light();
    }

    public boolean isLightOn(){
        return light.isSwitchedOn();
    }

    public Light getLight() {
        return light;
    }
}

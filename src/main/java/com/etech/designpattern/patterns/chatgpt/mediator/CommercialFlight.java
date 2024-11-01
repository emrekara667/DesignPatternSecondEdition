package com.etech.designpattern.patterns.chatgpt.mediator;

public class CommercialFlight extends Flight{

    public CommercialFlight(AirTrafficControl controlTower) {
        super(controlTower);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("CommercialFlight sending message: " + message);
        controlTower.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("CommercialFlight received message: " + message);
    }
}

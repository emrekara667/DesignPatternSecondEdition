package com.etech.designpattern.patterns.chatgpt.mediator;

abstract class Flight {
    protected AirTrafficControl controlTower;

    public Flight(AirTrafficControl controlTower){
        this.controlTower = controlTower;
        controlTower.registerFlight(this);
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String  message);
}

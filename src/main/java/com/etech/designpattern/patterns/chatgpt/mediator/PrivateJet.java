package com.etech.designpattern.patterns.chatgpt.mediator;

public class PrivateJet extends Flight{


    public PrivateJet(AirTrafficControl controlTower) {
        super(controlTower);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Private jet sending message: " + message);
        controlTower.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("PrivateJet received message: " + message);
    }
}

package com.etech.designpattern.patterns.chatgpt.mediator;

interface AirTrafficControl {
    void registerFlight(Flight flight);

    void sendMessage(String message, Flight flight);
}

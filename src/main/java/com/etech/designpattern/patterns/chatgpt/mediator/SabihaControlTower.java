package com.etech.designpattern.patterns.chatgpt.mediator;

import java.util.ArrayList;
import java.util.List;

public class SabihaControlTower implements AirTrafficControl {

    private List<Flight> flights = new ArrayList<>();

    @Override
    public void registerFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void sendMessage(String message, Flight flight) {
        flights.forEach(f -> {
            // Mesajı diger ucaklara gonder...
            if(f != flight)
                f.receiveMessage(message);
        });
    }
}

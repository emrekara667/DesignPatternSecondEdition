package com.etech.designpattern.patterns.chatgpt.mediator;

public class MainApp {
    public static void main(String[] args) {


        AirTrafficControl sabihaControlTower = new SabihaControlTower();


        Flight commercialFlight = new CommercialFlight(sabihaControlTower);
        Flight privateJet = new PrivateJet(sabihaControlTower);

        commercialFlight.sendMessage("emre geliyor");
        privateJet.sendMessage("kalkıs ıznı ıstıyorum");

    }
}

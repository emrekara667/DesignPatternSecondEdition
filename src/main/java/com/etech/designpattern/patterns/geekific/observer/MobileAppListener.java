package com.etech.designpattern.patterns.geekific.observer;

public class MobileAppListener implements EventListener {
    private final String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update(Event eventType) {
        System.out.println("The notification  was sent to : " + username + eventType);
        // Actually send the push notification
    }
}

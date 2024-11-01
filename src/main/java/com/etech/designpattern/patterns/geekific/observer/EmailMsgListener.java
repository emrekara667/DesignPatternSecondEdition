package com.etech.designpattern.patterns.geekific.observer;

public class EmailMsgListener implements EventListener{
    private final String email;

    public EmailMsgListener(String email) {
        this.email = email;
    }

    public void update(Event eventType){
        System.out.println("The email was sent to : " + email + eventType );
        // Actually send the email
    }
}

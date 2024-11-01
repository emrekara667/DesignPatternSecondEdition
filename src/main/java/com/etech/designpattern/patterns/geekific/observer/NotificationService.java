package com.etech.designpattern.patterns.geekific.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<EventListener> customers;

    public NotificationService() {
        this.customers = new ArrayList<>();
    }

    public void subscribe(EventListener listener){
        customers.add(listener);
    }

    public void unsubscribe(EmailMsgListener listener){
        customers.remove(listener);
    }

    public void notifyTest(){
        //customers.forEach(EventListener::update);
    }
}

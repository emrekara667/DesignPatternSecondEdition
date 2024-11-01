package com.etech.designpattern.patterns.geekific.observer;

public class Store {
    private final  ComplexNotificationService notificationService;

    public Store() {
        this.notificationService = new ComplexNotificationService();
    }

    public void newItemPromotion(Event eventType){
        notificationService.notifyTest(eventType);
    }

    public ComplexNotificationService getNotificationService() {
        return notificationService;
    }
}

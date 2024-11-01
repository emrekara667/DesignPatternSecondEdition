package com.etech.designpattern.patterns.geekific.observer;

public class MainApp {
    public static void main(String[] args) {


        Store store = new Store();
        store.getNotificationService().subscribe(Event.SALE ,new EmailMsgListener("emrekara677@gmail.com"));
        store.getNotificationService().subscribe(Event.SALE,new EmailMsgListener("emre_kara_97@hotmail.com"));
        store.getNotificationService().subscribe(Event.NEW_ITEM, new MobileAppListener("emre_kara_97@hotmail.com"));
        store.newItemPromotion(Event.SALE);

    }
}

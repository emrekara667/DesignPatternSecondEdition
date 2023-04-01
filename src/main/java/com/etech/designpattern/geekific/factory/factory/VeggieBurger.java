package com.etech.designpattern.geekific.factory.simplefactory;

public class VeggieBurger extends Burger{
    private boolean combo;

    public void prepare(){
        System.out.println("VeggieBurger is preparing");
    }

    @Override
    public String toString() {
        return "VeggieBurger{" +
                "combo=" + combo +
                ", productId=" + productId +
                ", addOns='" + addOns + '\'' +
                '}';
    }
}

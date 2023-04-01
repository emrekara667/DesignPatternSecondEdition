package com.etech.designpattern.geekific.factory.simplefactory;

public class BeefBurger extends Burger{

    private boolean angus;

    public void prepare(){
        System.out.println("Beef burger is preparing...");
    }

    @Override
    public String toString() {
        return "BeefBurger{" +
                "angus=" + angus +
                ", productId=" + productId +
                ", addOns='" + addOns + '\'' +
                '}';
    }
}

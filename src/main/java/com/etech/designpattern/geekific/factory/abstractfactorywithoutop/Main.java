package com.etech.designpattern.geekific.factory.abstractfactory;

public class Main {
    public static void main(String[] args) {

        AsusCompany asusFactory = new AsusCompany();
        Component component = asusFactory.orderGpu();
        System.out.println(component);


        MsiCompany msiFactory = new MsiCompany();
        Component component1 = msiFactory.orderGpu();
        System.out.println(component1);


    }
}

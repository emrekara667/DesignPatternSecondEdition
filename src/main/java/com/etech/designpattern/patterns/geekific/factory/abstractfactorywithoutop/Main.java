package com.etech.designpattern.patterns.geekific.factory.abstractfactorywithoutop;

public class Main {
    public static void main(String[] args) {

        com.etech.designpattern.patterns.geekific.factory.abstractfactorywithoutop.AsusCompany asusFactory = new AsusCompany();
        Component component = asusFactory.orderGpu();
        System.out.println(component);


        com.etech.designpattern.patterns.geekific.factory.abstractfactorywithoutop.MsiCompany msiFactory = new MsiCompany();
        Component component1 = msiFactory.orderGpu();
        System.out.println(component1);


    }
}

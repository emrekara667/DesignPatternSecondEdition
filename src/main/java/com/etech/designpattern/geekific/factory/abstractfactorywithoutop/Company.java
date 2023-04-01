package com.etech.designpattern.geekific.factory.abstractfactory;

public abstract class Company {

    public Component orderGpu(){
        Component component = createGpu(null);
        component.assemble();
        return component;
    }
    public abstract Component createGpu(String request);
}

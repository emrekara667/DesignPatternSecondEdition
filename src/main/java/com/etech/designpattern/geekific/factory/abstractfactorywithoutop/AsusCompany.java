package com.etech.designpattern.geekific.factory.abstractfactory;

public class AsusCompany extends Company {

    @Override
    public Component createGpu(String request){
        Component component;
        if("GPU".equalsIgnoreCase(request)){
            component = new AsusGpu();
        }else{
            component = new AsusMonitor();
        }
        return component;
    }
}

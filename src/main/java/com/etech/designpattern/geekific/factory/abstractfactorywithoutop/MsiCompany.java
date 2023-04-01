package com.etech.designpattern.geekific.factory.abstractfactory;

public class MsiCompany extends Company {

    @Override
    public Component createGpu(String request){
        Component component;
        if("GPU".equalsIgnoreCase(request)){
            component = new MsiGpu();
        }else{
            component = new MsiMonitor();
        }
        return component;
    }

}

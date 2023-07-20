package com.etech.designpattern.patterns.geekific.factory.abstractfactorywithoutop;

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

package com.etech.designpattern.geekific.factory.abstractfactory;

public class AsusMonitor implements Component {
    @Override
    public void assemble(){
        System.out.println("AsusMonitor assembling...");
    }

    @Override
    public String toString() {
        return "AsusMonitor{}";
    }
}

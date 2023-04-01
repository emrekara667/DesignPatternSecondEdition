package com.etech.designpattern.geekific.factory.abstractfactory;

public class MsiMonitor implements Component{
    @Override
    public void assemble(){
        System.out.println("MsiMonitor assembling...");
    }

    @Override
    public String toString() {
        return "MsiMonitor{}";
    }
}

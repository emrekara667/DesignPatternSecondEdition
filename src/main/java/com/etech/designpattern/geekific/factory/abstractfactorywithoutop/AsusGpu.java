package com.etech.designpattern.geekific.factory.abstractfactory;

public class AsusGpu implements Component {
    @Override
    public void assemble(){
        System.out.println("Assembling ASUS Gpu...");
    }

    @Override
    public String toString() {
        return "AsusGpu{}";
    }
}

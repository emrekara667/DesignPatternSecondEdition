package com.etech.designpattern.geekific.factory.abstractfactory;

public class MsiGpu implements Component {

    @Override
    public void assemble(){
        System.out.println("Assembling MSI Gpu");
    }

    @Override
    public String toString() {
        return "MsiGpu{}";
    }
}

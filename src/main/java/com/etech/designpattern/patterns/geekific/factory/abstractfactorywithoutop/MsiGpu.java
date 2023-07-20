package com.etech.designpattern.patterns.geekific.factory.abstractfactorywithoutop;

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

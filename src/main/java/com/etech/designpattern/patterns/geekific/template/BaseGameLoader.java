package com.etech.designpattern.patterns.geekific.template;

public abstract class BaseGameLoader {
    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        initializeProfiles();
        cleanTempFiles();
    }

    abstract byte[] loadLocalData();
    abstract void createObjects(byte[] data);
    abstract void downloadAdditionalFiles();
    abstract void initializeProfiles();

    protected void cleanTempFiles(){
        System.out.println("Cleaning temporary files...");
        // Some code
    }
}

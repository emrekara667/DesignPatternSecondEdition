package com.etech.designpattern.patterns.geekific.template;

public class MainApp {
    public static void main(String[] args) {
        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();

        System.out.println("==========================================");


        DiabloLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();
    }
}

package com.etech.designpattern.patterns.geekific.memento;

public class MainApp {
    public static void main(String[] args) {


        Editor editor = new Editor();
        editor.write("Like and");
        editor.printText();
        editor.write("Like and Subscribe");
        editor.printText();
        editor.write("Like and Subscribe to Geekific!");
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
        editor.undo();
        editor.printText();
    }
}

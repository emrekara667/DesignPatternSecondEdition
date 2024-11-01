package com.etech.designpattern.patterns.chatgpt.memento;

public class MainApp {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Game game = new Game(100, 1, "Start point");

        caretaker.save(game);
        System.out.println("1. Save State: " + game);

        game.setHealth(80);
        game.setLevel(2);
        game.setPosition("Middle point");



        caretaker.save(game);
        System.out.println("2. Save State: " + game);

        game.setHealth(50);
        game.setLevel(3);
        game.setPosition("End Point");
        System.out.println("Further changed states : " + game);



        caretaker.undo(game);
        System.out.println("After undo: " + game);


        caretaker.undo(game);
        System.out.println("After undo to initial state " + game);
    }
}

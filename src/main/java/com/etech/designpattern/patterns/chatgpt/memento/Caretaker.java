package com.etech.designpattern.patterns.chatgpt.memento;

import java.util.Stack;

public class Caretaker {

    private Stack<Game.Memento> history = new Stack<>();

    // Save the memento in the history
    public void save(Game game){
        history.push(game.save());
    }

    // Restore the game state from the last memento
    public void undo(Game game){
        if(!history.isEmpty()){
            game.restore(history.pop());
        }else {
            System.out.println("No states to restore");
        }
    }


}

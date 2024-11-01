package com.etech.designpattern.patterns.geekific.memento;

import java.util.Deque;
import java.util.LinkedList;

public class Editor {
    private Deque<TextArea.Memento> stateHistory;
    private TextArea textArea;

    public Editor() {
        this.stateHistory = new LinkedList<>(); // FIFO
        this.textArea = new TextArea();
    }

    public void write(String text){
        textArea.setText(text);
        stateHistory.addFirst(textArea.takeSnapshot());
    }

    public void undo(){
        textArea.restore(stateHistory.removeFirst());
    }

    public void printText() {
        System.out.println(textArea.getText());
    }
}

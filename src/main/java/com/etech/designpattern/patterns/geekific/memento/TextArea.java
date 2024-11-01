package com.etech.designpattern.patterns.geekific.memento;

public class TextArea {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento takeSnapshot(){
        return new Memento(this.text);
    }

    public void restore(Memento memento){
        this.text = memento.getSavedText();
    }

    public static class Memento {
        private final String text;

        public Memento(String textToSave) {
            this.text = textToSave;
        }

        private String getSavedText() {
            return text;
        }
    }
}

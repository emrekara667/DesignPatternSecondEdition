package com.etech.designpattern.patterns.chatgpt.memento;

public class Game {
    private int health;
    private int level;
    private String position;


    public Game(int health, int level, String position){
        this.health = health;
        this.level = level;
        this.position = position;
    }

    // Save current state as a Memento object
    public Memento save(){
        return new Memento(health, level, position);
    }

    // Restore the game state from a Memento object
    public void restore(Memento memento){
        this.health = memento.getHealth();
        this.level = memento.getLevel();
        this.position = memento.getPosition();
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Game [health=" + health + ", level=" + level + ", position=" + position + "]";
    }

    public static class Memento{
        private int health;
        private int level;
        private String position;


        public Memento(int health, int level, String position){
            this.health = health;
            this.level = level;
            this.position = position;
        }

        public int getHealth() {
            return health;
        }

        public int getLevel() {
            return level;
        }

        public String getPosition() {
            return position;
        }
    }
}

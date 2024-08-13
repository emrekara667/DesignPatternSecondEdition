package com.etech.designpattern.patterns.geekific.thechainofresponsibility.handlers;

public abstract class Handler {
    private Handler next; // will store a reference to the next handler in the chain

    public Handler setNextHandler(Handler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(String username, String password);

    protected  boolean handleNext(String username, String password) {
        if(next == null)
            return true;
        return next.handle(username, password);
    }
}

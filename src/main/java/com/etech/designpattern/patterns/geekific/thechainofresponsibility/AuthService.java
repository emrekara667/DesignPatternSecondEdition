package com.etech.designpattern.patterns.geekific.thechainofresponsibility;

import com.etech.designpattern.patterns.geekific.thechainofresponsibility.handlers.Handler;

public class AuthService {
    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String email, String password) {
        if(handler.handle(email, password)){
            System.out.println("Authorization was succesful!");

            // Do stuff for authorized users

            return true;
        }
        return false;
    }
}

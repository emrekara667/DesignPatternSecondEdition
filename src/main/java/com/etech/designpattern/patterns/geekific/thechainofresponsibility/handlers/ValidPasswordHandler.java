package com.etech.designpattern.patterns.geekific.thechainofresponsibility.handlers;

import com.etech.designpattern.patterns.geekific.thechainofresponsibility.Database;

public class ValidPasswordHandler extends Handler {
    private Database databsae;

    public ValidPasswordHandler(Database databsae) {
        this.databsae = databsae;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!databsae.isValidPassword(username, password)){
            System.out.println("Wrong password!!!");
            return false;
        }
        return handleNext(username, password);
    }
}

package com.etech.designpattern.patterns.geekific.thechainofresponsibility.handlers;

public class RoleCheckHandler extends Handler {
    @Override
    public boolean handle(String username, String password) {
        if("admin_username".equals(username)) {
            System.out.println("Loading Admin page");
            return true;
        }
        return handleNext(username, password);
    }
}

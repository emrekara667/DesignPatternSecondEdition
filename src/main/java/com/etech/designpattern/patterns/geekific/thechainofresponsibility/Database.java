package com.etech.designpattern.patterns.geekific.thechainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String, String> users;

    public Database() {
        this.users = new HashMap<>();
        users.put("admin_username","admin_password");
        users.put("user_username","user_password");
        users.put("username","password");
    }

    public boolean isValidUser(String username){
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password){
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }
}

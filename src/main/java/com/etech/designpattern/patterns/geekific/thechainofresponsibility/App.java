package com.etech.designpattern.patterns.geekific.thechainofresponsibility;

import com.etech.designpattern.patterns.geekific.thechainofresponsibility.handlers.Handler;
import com.etech.designpattern.patterns.geekific.thechainofresponsibility.handlers.RoleCheckHandler;
import com.etech.designpattern.patterns.geekific.thechainofresponsibility.handlers.UserExistHandler;
import com.etech.designpattern.patterns.geekific.thechainofresponsibility.handlers.ValidPasswordHandler;

public class App {
    public static void main(String[] args) {
        Database database = new Database();

//        Handler handler = new UserExistHandler(database)
//                .setNextHandler(new ValidPasswordHandler(database))
//                .setNextHandler(new RoleCheckHandler());

        UserExistHandler handler = new UserExistHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());


        AuthService service = new AuthService(handler);
        service.logIn("username", "password");
    }
}

package com.patterns.behavioral.chain_of_responsibility.middleware;

import com.patterns.behavioral.chain_of_responsibility.server.Server;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 * <p>
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
public class UserExistsMiddleware extends Middleware {
    private final Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }
}

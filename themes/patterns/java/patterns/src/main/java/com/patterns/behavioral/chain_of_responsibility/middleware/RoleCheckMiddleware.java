package com.patterns.behavioral.chain_of_responsibility.middleware;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 * <p>
 * ConcreteHandler. Checks a user's role.
 */
public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}

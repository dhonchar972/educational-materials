package com.patterns.behavioral.chain_of_responsibility;

import com.patterns.behavioral.chain_of_responsibility.middleware.Middleware;
import com.patterns.behavioral.chain_of_responsibility.middleware.RoleCheckMiddleware;
import com.patterns.behavioral.chain_of_responsibility.middleware.ThrottlingMiddleware;
import com.patterns.behavioral.chain_of_responsibility.middleware.UserExistsMiddleware;
import com.patterns.behavioral.chain_of_responsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 * <p>
 * Demo class. Everything comes together here.
 */
public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}

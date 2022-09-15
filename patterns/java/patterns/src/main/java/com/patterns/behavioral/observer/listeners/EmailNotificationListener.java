package com.patterns.behavioral.observer.listeners;

import java.io.File;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class EmailNotificationListener implements EventListener {
    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType
                + " operation with the following file: " + file.getName());
    }
}

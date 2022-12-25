package com.patterns.behavioral.observer;

import com.patterns.behavioral.observer.editor.Editor;
import com.patterns.behavioral.observer.listeners.EmailNotificationListener;
import com.patterns.behavioral.observer.listeners.LogOpenListener;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

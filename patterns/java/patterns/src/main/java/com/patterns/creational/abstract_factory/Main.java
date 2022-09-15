package com.patterns.creational.abstract_factory;

import com.patterns.creational.abstract_factory.client.Application;
import com.patterns.creational.abstract_factory.factories.GUIFactory;
import com.patterns.creational.abstract_factory.factories.MacOSFactory;
import com.patterns.creational.abstract_factory.factories.WindowsFactory;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Main {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}

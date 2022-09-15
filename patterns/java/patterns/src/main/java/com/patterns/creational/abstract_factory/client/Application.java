package com.patterns.creational.abstract_factory.client;

import com.patterns.creational.abstract_factory.buttons.Button;
import com.patterns.creational.abstract_factory.checkboxes.Checkbox;
import com.patterns.creational.abstract_factory.factories.GUIFactory;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

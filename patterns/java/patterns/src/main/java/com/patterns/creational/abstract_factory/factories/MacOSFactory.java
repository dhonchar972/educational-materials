package com.patterns.creational.abstract_factory.factories;

import com.patterns.creational.abstract_factory.buttons.Button;
import com.patterns.creational.abstract_factory.buttons.MacOSButton;
import com.patterns.creational.abstract_factory.checkboxes.Checkbox;
import com.patterns.creational.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

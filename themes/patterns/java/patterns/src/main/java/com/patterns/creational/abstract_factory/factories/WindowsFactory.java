package com.patterns.creational.abstract_factory.factories;

import com.patterns.creational.abstract_factory.buttons.Button;
import com.patterns.creational.abstract_factory.buttons.WindowsButton;
import com.patterns.creational.abstract_factory.checkboxes.Checkbox;
import com.patterns.creational.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

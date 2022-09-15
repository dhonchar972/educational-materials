package com.patterns.creational.abstract_factory.factories;

import com.patterns.creational.abstract_factory.buttons.Button;
import com.patterns.creational.abstract_factory.checkboxes.Checkbox;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

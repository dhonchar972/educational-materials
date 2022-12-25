package com.patterns.creational.abstract_factory.checkboxes;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}

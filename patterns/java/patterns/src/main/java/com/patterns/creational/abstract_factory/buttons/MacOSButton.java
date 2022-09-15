package com.patterns.creational.abstract_factory.buttons;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}

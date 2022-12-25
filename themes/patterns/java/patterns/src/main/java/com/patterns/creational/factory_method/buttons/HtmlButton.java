package com.patterns.creational.factory_method.buttons;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class HtmlButton implements Button {
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}

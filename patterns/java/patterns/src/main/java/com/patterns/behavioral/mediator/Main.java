package com.patterns.behavioral.mediator;

import com.patterns.behavioral.mediator.components.*;
import com.patterns.behavioral.mediator.mediator.Editor;
import com.patterns.behavioral.mediator.mediator.Mediator;

import javax.swing.*;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 * <p>
 * Demo class. Everything comes together here.
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}

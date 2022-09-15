package com.patterns.creational.factory_method.dialogs;

import com.patterns.creational.factory_method.buttons.Button;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public abstract class Dialog {
    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}

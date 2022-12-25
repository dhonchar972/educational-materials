package com.patterns.creational.factory_method.dialogs;

import com.patterns.creational.factory_method.buttons.Button;
import com.patterns.creational.factory_method.buttons.WindowsButton;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

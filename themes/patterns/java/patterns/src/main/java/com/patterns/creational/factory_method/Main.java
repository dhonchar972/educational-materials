package com.patterns.creational.factory_method;

import com.patterns.creational.factory_method.dialogs.Dialog;
import com.patterns.creational.factory_method.dialogs.HtmlDialog;
import com.patterns.creational.factory_method.dialogs.WindowsDialog;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}

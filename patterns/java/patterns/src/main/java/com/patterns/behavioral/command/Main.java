package com.patterns.behavioral.command;

import com.patterns.behavioral.command.editor.Editor;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}

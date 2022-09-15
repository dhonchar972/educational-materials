package com.patterns.behavioral.command.commands;

import com.patterns.behavioral.command.editor.Editor;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}

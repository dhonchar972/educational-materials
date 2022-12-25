package com.patterns.behavioral.command.commands;

import com.patterns.behavioral.command.editor.Editor;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}

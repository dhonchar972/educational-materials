package com.patterns.behavioral.command.commands;

import com.patterns.behavioral.command.editor.Editor;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}

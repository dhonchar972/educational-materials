package com.patterns.behavioral.memento.history;

import com.patterns.behavioral.memento.editor.Editor;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Memento {
    private final String backup;
    private final Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore() {
        editor.restore(backup);
    }
}

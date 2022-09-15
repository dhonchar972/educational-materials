package com.patterns.behavioral.memento.commands;

import com.patterns.behavioral.memento.editor.Editor;
import com.patterns.behavioral.memento.shapes.Shape;

import java.awt.*;


/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class ColorCommand implements Command {
    private final Editor editor;
    private final Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}

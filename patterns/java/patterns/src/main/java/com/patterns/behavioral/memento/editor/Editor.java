package com.patterns.behavioral.memento.editor;

import com.patterns.behavioral.memento.commands.Command;
import com.patterns.behavioral.memento.history.History;
import com.patterns.behavioral.memento.history.Memento;
import com.patterns.behavioral.memento.shapes.CompoundShape;
import com.patterns.behavioral.memento.shapes.Shape;

import javax.swing.*;
import java.io.*;
import java.util.Base64;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Editor extends JComponent {
    private final Canvas canvas;
    private CompoundShape allShapes = new CompoundShape();
    private final History history;

    public Editor() {
        canvas = new Canvas(this);
        history = new History();
    }

    public void loadShapes(Shape... shapes) {
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    public CompoundShape getShapes() {
        return allShapes;
    }

    public void execute(Command c) {
        history.push(c, new Memento(this));
        c.execute();
    }

    public void undo() {
        if (history.undo())
            canvas.repaint();
    }

    public void redo() {
        if (history.redo())
            canvas.repaint();
    }

    public String backup() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this.allShapes);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch (IOException e) {
            return "";
        }
    }

    public void restore(String state) {
        try {
            byte[] data = Base64.getDecoder().decode(state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.allShapes = (CompoundShape) ois.readObject();
            ois.close();
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException occurred.");
        } catch (IOException e) {
            System.out.print("IOException occurred.");
        }
    }
}

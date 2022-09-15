package com.patterns.behavioral.memento.shapes;

import java.awt.*;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Rectangle extends BaseShape {
    private final int width;
    private final int height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }
}

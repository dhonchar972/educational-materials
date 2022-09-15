package com.patterns.structural.composite.shapes;

import java.awt.*;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}

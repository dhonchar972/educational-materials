package com.patterns.structural.flyweight.trees;

import java.awt.*;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public class Tree {
    private final int x;
    private final int y;
    private final TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}

package com.patterns.behavioral.visitor.shapes;

import com.patterns.behavioral.visitor.visitor.Visitor;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}

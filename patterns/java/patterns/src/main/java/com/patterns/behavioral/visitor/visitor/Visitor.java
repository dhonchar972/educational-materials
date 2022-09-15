package com.patterns.behavioral.visitor.visitor;

import com.patterns.behavioral.visitor.shapes.Circle;
import com.patterns.behavioral.visitor.shapes.CompoundShape;
import com.patterns.behavioral.visitor.shapes.Dot;
import com.patterns.behavioral.visitor.shapes.Rectangle;

/**
 * Created by Dmytro Honchar
 * Date: 9/15/2022
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}

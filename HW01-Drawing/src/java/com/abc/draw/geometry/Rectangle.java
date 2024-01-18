package com.abc.draw.geometry;

import java.awt.*;

import com.abc.draw.*;

/**
 * Implementation as a subclass of Square.
 * Cons, the calc perimeter method does not work
 */
public class Rectangle extends Square implements Drawable{

    public Rectangle(Point point, double width, double height) {
        super(point, width);
        super.setHeight(height);
        super.setPoints();
        super.setLines();
    }

    @Override
    public void draw(Graphics2D g2) {
        Line[] ar = super.getLines();
        for(Line line: ar) {
            line.draw(g2);
        }
    }

}

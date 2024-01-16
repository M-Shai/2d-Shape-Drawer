package com.abc.draw.geometry;

import java.awt.*;

import com.abc.draw.*;

public class Line implements Drawable {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public void draw(Graphics2D g2) {
        int x1 = (int) Math.round(p1.getX());
        int y1 = (int) Math.round(p1.getY());
        int x2 = (int) Math.round(p2.getX());
        int y2 = (int) Math.round(p2.getY());

        g2.drawLine(x1, y1, x2, y2);
    }
}

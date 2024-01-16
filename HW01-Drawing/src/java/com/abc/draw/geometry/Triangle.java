package com.abc.draw.geometry;

import java.awt.*;
import java.util.*;

import com.abc.draw.*;

public class Triangle implements Drawable{

    private ArrayList<Point> points_ar = new ArrayList<>();
    private ArrayList<Line> line_ar = new ArrayList<>();

    public Triangle(Point point1, Point point2, Point point3) {
        points_ar.add(point1);
        points_ar.add(point2);
        points_ar.add(point3);
        setLines();
    }

    private void setLines() {
        for(int index = 0; index < 3; index++) {
            //System.out.println("index = " + index);
            if(index < 2) {
                line_ar.add(new Line(points_ar.get(index), points_ar.get(index + 1)));
                //printPoints(line_ar.get(index).getP1(), line_ar.get(index).getP2());
            }
            else {
                line_ar.add(new Line(points_ar.get(index), points_ar.get(0)));
                //printPoints(line_ar.get(index).getP1(), line_ar.get(index).getP2());
            }
        }
    }

    @Override
    public void draw(Graphics2D g2) {
        //line_ar[0].draw(g2);
        for(Line line: line_ar) {
            line.draw(g2);
        }
    }

    public void printPoints() {
        for(Point pt: points_ar) {
            System.out.println("(" + pt.getX() + "," + pt.getY() + ")");
        }
    }

    public void printPoints(Point pt1, Point pt2) {
        System.out.println("point1: (" + pt1.getX() + "," + pt1.getY() + ")");
        System.out.println("pointt2:(" + pt2.getX() + "," + pt2.getY() + ")\n");
    }

    public void printLines() {
        for(Line line: line_ar) {
            printPoints(line.getP1(),line.getP2());
        }
    }

}


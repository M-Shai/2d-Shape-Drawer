package com.abc.draw.geometry;

import java.awt.*;

import com.abc.draw.*;

/**
 * Implementation as super class for Rectangle class.
 * Cons see Rectangle
 */
public class Square implements Drawable {
    private double width;
    private double height;
    private Point point;
    private Point points_ar[] = new Point[4];
    private Line line_ar[] = new Line[4];

    public Square(Point point, double width) {
        this.width = width;
        this.height = width;
        this.point = point;
        //setPoints();
        //printPoints();
        //setLines();
        //printLines();
    }

    protected void setPoints() {
        points_ar[0] = point;
        points_ar[1] = new Point(point.getX() + width, point.getY());
        points_ar[2] = new Point(point.getX() + width, point.getY() + height);
        points_ar[3] = new Point(point.getX(), point.getY() + height);
        //printPoints();
    }

    protected void setLines() {
        for(int index = 0; index < 4; index++) {
            //System.out.println("index = " + index);
            if(index < 3) {
                line_ar[index] = new Line(points_ar[index], points_ar[index + 1]);
                //printPoints(line_ar[index].getP1(), line_ar[index].getP2());
            }
            else {
                line_ar[index] = new Line(points_ar[index], points_ar[0]);
                //printPoints(line_ar[index].getP1(), line_ar[index].getP2());
            }
        }
    }

    public Line[] getLines() {
        return line_ar;
    }

    public Point[] getPoints() {
        return points_ar;
    }

    @Override
    public void draw(Graphics2D g2) {
        setPoints();
        setLines();
        //line_ar[0].draw(g2);
        for(Line line: line_ar) {
            line.draw(g2);
        }
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
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

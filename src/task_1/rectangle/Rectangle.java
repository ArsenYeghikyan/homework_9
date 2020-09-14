package task_1.rectangle;

import task_1.base.BaseShape;

public class Rectangle implements BaseShape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void printShapeInfo() {
        System.out.println("It's a rectangle with width " + width + " and length " + length);
    }
}

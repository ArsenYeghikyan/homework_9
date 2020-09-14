package task_1.volumetricshapes;

import task_1.rectangle.Rectangle;

public class RectangularParallelepiped extends Rectangle implements VolumetricShape {
    private double height;


    public RectangularParallelepiped(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    @Override
    public double getPerimeter() {
        return 4 * (height + getLength() + getWidth());
    }

    @Override
    public double getArea() {
        return 2 * (height * getLength() + getLength() * getWidth() + getHeight() * getWidth());
    }

    @Override
    public void printShapeInfo() {
        System.out.println(" It's a Parallelepiped with width " + getWidth() + " and length " + getLength() + " and height ");
    }

    @Override
    public double getVolume() {
        return getLength() * getWidth() * height;
    }
}

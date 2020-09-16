package task_1.volumetricshapes;

import task_1.rectangle.Rectangle;

public class Cube extends Rectangle implements VolumetricShape {

    private static final double FACETS = 6;
    private static final double ALL_CUBES_EDGES = 12;

    public Cube(double height) {

        super(height, height);
    }


    @Override
    public double getVolume() {
        return Math.pow(getLength(), 3);
    }

    @Override
    public double getPerimeter() {
        return ALL_CUBES_EDGES * getLength();
    }

    @Override
    public double getArea() {
        return FACETS * Math.pow(getLength(), 2);
    }

    @Override
    public void printShapeInfo() {
        System.out.println("It's a cuboid with width " + getWidth() + " and length " + getLength() + " and height " + getLength());
    }
}

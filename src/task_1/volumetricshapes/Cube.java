package task_1.volumetricshapes;

public class Cube extends RectangularParallelepiped {

    private static final double FACETS = 6;
    private static final double ALL_CUBES_EDGES = 12;

    public Cube(double width, double length, double height) {

        super(height, height, height);
    }


    @Override
    public double getVolume() {
        return Math.pow(getHeight(), 3);
    }

    @Override
    public double getPerimeter() {
        return ALL_CUBES_EDGES * getHeight();
    }

    @Override
    public double getArea() {
        return FACETS * Math.pow(getHeight(), 2);
    }

    @Override
    public void printShapeInfo() {
        System.out.println("It's a cuboid with width " + getWidth() + " and length " + getLength() + " and height " + getHeight());
    }
}

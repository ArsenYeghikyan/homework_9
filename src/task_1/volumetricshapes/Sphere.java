package task_1.volumetricshapes;

import task_1.circleshapes.Circle;


public class Sphere extends Circle implements VolumetricShape {


    public Sphere(double radius) {
        super(radius);
    }


    @Override
    public double getArea() {
        return 4 * super.getArea();
    }

    @Override
    public void printShapeInfo() {
        System.out.println("It's a sphere with radius  " + getRadius());
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(getRadius(), 3);
    }
}

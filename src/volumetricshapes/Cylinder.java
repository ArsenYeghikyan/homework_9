package volumetricshapes;

import circleshapes.Circle;

public class Cylinder extends Circle implements VolumetricShape {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    @Override
    public double getVolume() {

        return Math.PI * Math.pow(getRadius(), 2) * height;

    }

    @Override
    public double getPerimeter() {

        return (super.getPerimeter() + height) * 2;
    }

    @Override
    public double getArea() {

        return 2 * (Math.PI * getRadius() * (height + getRadius()));

    }

    @Override
    public void printShapeInfo() {
        System.out.println("It's a cylinder with radius " + getRadius() + " and height " + height);
    }


}

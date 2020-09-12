package triangleshapes;


import base.BaseShape;

public class Triangle implements BaseShape {
    private double triangleSideA = 0;
    private double triangleSideB = 0;
    private double triangleSideC = 0;

    public Triangle(double sideA, double sideB, double sideC) {
        this.triangleSideA = sideA;
        this.triangleSideB = sideB;
        this.triangleSideC = sideC;
    }

    public double getTriangleSideA() {
        return triangleSideA;
    }

    public double getTriangleSideB() {
        return triangleSideB;
    }

    public double getTriangleSideC() {
        return triangleSideC;
    }

    @Override
    public double getPerimeter() {
        return triangleSideA + triangleSideB + triangleSideC;
    }

    private double getHalfPerimeter() {
        return getPerimeter() / 2;
    }


    @Override
    public double getArea() {
        double s = getHalfPerimeter();
        return Math.sqrt(s * (s - triangleSideA) * (s - triangleSideB) * (s - triangleSideC));
    }


    public void printShapeInfo() {
        System.out.println(getTriangleSideA() + ", " + getTriangleSideB() + ", " + getTriangleSideC());
    }

}

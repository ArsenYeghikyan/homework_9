package triangleshapes;

public class RightTriangle extends Triangle {


    public RightTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }


    @Override
    public double getArea() {
        return 0.5 * getTriangleSideA() * getTriangleSideB();
    }

    public void printShapeInfo() {
        System.out.print(" It's a right triangle with sides : ");
        super.printShapeInfo();
    }


}

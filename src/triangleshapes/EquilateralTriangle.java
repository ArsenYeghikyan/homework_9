package triangleshapes;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double sideA) {
        super(sideA, sideA, sideA);
    }


    @Override
    public   double getArea() {
        return Math.pow(getTriangleSideA(),2)/4 * Math.sqrt(3);
    }




    @Override
    public void printShapeInfo() {
        System.out.print(" It's an equilateral triangle with sides : ");
        super.printShapeInfo();
    }
}

package task_1.circleshapes;

import task_1.base.BaseShape;

public class Circle implements BaseShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    @Override
   public double getPerimeter() {

        return 2 * (Math.PI * radius);

    }

    @Override
  public   double getArea() {

        return Math.PI * Math.pow(getRadius(),2);

    }

    @Override
    public void printShapeInfo() {
        System.out.println("It's a circle with radius  " + radius);
    }


}

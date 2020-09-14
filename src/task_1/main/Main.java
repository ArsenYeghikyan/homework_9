package task_1.main;

import task_1.base.BaseShape;
import task_1.circleshapes.Circle;
import task_1.printer.Printer;
import task_1.rectangle.Rectangle;
import task_1.triangleshapes.EquilateralTriangle;
import task_1.triangleshapes.RightTriangle;
import task_1.volumetricshapes.*;

public class Main {
    public static void main(String[] args) {

        BaseShape circle = new Circle(5.0);
        BaseShape equilateralTriangle = new EquilateralTriangle(10);
        BaseShape rightTriangle = new RightTriangle(5, 5, 6);
        BaseShape rectangle = new Rectangle(4,5);
        VolumetricShape cylinder = new Cylinder(1, 2);
        VolumetricShape sphere = new Sphere(5);
        VolumetricShape rectangularParallelepiped = new RectangularParallelepiped(4,6,3);
        VolumetricShape cube = new Cube(4,4,4);


//        Printer.printAreaAndPerimeter(circle);
//
//        Printer.printAreaAndPerimeter(cylinder);
//        Printer.printAreaAndPerimeter(sphere);
//        Printer.printAreaAndPerimeter(equilateralTriangle);
//        Printer.printAreaAndPerimeter(rightTriangle);
//        Printer.printShapeVolume(cylinder);
//        Printer.printShapeVolume(sphere);


        Printer.printAreaAndPerimeter(cube);
        Printer.printShapeVolume(cube);
        Printer.printAreaAndPerimeter(rectangularParallelepiped);
        Printer.printShapeVolume(rectangularParallelepiped);

    }



}
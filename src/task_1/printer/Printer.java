package task_1.printer;

import task_1.base.BaseShape;
import task_1.volumetricshapes.VolumetricShape;

 public  final class Printer {

    public static void printAreaAndPerimeter(BaseShape s) {
        printInfo(s);
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());

    }

    public static void printShapeVolume(VolumetricShape volumetricShape) {

        printInfo(volumetricShape);
        System.out.println("Volume : " + volumetricShape.getVolume());
    }

    public static void printInfo(BaseShape s) {
        s.printShapeInfo();
    }




}

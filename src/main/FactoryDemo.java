package main;

import factory.ShapeFactory;
import shapes.Shape;

/**
 * Created by DarkPrince on 10/13/2015.
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getGeometricFigure("CIRCLE");
        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getGeometricFigure("TRIANGLE");
        //call draw method of Rectangle
        shape2.draw();
    }
}
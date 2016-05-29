package factory;

import shapes.Circle;
import shapes.Shape;
import shapes.Triangle;

/**
 * Created by DarkPrince on 10/13/2015.
 */
public class ShapeFactory {
    private Circle circle;
    private Triangle triangle;

    public Shape getGeometricFigure(String shapeCalled) {
        if (shapeCalled.equalsIgnoreCase("Circle")) {
            circle = this.createCircle();
            return circle;
        } else if (shapeCalled.equalsIgnoreCase("Triangle")) {
            triangle = this.createTriangle();
            return triangle;
        } else {
            return null;
        }
    }

    public Circle createCircle() {
        return new Circle();
    }

    public Triangle createTriangle() {
        return new Triangle();
    }

}

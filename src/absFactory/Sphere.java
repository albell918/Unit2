package absFactory;

import factory.Figure;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Sphere
 * @since 25.03.2021 - 22.45
 */
public class Sphere implements Figure {

    private double radius;

    public Sphere() {
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public String getNameOfFigure() {
        return "I am sphere";
    }
}

package absFactory;

import factory.Figure;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Parallelepiped
 * @since 25.03.2021 - 22.44
 */
public class Parallelepiped implements Figure {

    private double length;
    private double width;
    private double height;

    public Parallelepiped() {
    }

    @Override
    public String getNameOfFigure() {
        return "I am parallelepiped";
    }
}

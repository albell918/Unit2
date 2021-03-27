package absFactory;

import factory.Circle;
import factory.Figure;
import factory.Rectangle;
import factory.Triangle;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class FlatFactory
 * @since 25.03.2021 - 22.52
 */
public class FlatFactory extends AbstractFactory {
    @Override
    Figure createFigure(String figureType) {

        if (figureType == null) {
            return null;
        }

        if (figureType.equalsIgnoreCase("Circle")) {

            return new Circle();

        } else if (figureType.equalsIgnoreCase("Rectangle")) {

            return new Rectangle();

        } else if (figureType.equalsIgnoreCase("Triangle")) {

            return new Triangle();

        }


        return null;
    }
}

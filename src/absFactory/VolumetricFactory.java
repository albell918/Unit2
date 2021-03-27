package absFactory;

import factory.Figure;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class VolumetricFactory
 * @since 25.03.2021 - 22.52
 */
public class VolumetricFactory extends AbstractFactory {
    @Override
    Figure createFigure(String figureType) {


        if (figureType.equalsIgnoreCase("Sphere")) {

            return  new Sphere();

        }

        return null;
    }
}

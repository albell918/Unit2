package absFactory;

import factory.Figure;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class AbstractFactory
 * @since 25.03.2021 - 22.50
 */
public abstract class AbstractFactory {

    abstract Figure createFigure(String figureType);

}

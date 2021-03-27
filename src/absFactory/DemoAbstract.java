package absFactory;

import factory.Figure;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class DemoAbstract
 * @since 25.03.2021 - 22.58
 */
public class DemoAbstract {

    public static void main(String[] args) {

        AbstractFactory as1 = FactoryFigureProducer.getFigureFactory(false);

        Figure as1Figure = as1.createFigure("Sphere");

    }

}

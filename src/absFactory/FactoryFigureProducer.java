package absFactory;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class FactoryFigureProducer
 * @since 25.03.2021 - 22.55
 */
public class FactoryFigureProducer {

    public static AbstractFactory getFigureFactory(boolean isFlat) {

        return isFlat ? new FlatFactory() : new VolumetricFactory();

    }

}

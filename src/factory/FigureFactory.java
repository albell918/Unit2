package factory;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class FigureFactory
 * @since 25.03.2021 - 22.02
 */
public class FigureFactory {

    public Figure getFigure(String figureType) {

        if (figureType == null) {
            return null;
        }

        if (figureType.equalsIgnoreCase("Circle")){

            return new Circle();

        }

        else if (figureType.equalsIgnoreCase("Rectangle")){

            return new Rectangle();

        }

        else if (figureType.equalsIgnoreCase("Triangle")){

            return new Triangle();

        }


        return null;

    }


}

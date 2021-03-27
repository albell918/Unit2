package factory;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Main
 * @since 25.03.2021 - 22.35
 */
public class Main {

    public static void main(String[] args) {

        FigureFactory fact1 = new FigureFactory();

        Circle c1 = (Circle) fact1.getFigure("Circle");
        //

        c1.setRadius(5);

        System.out.println(c1.getNameOfFigure());

    }

}

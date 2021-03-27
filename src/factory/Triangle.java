package factory;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Triangle
 * @since 25.03.2021 - 21.49
 */
public class Triangle implements Figure {

    private double trSide1;
    private double trSide2;
    private double trSide3;


    @Override
    public String getNameOfFigure() {
        return "I am triangle";
    }
}

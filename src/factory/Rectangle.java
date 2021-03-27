package factory;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Rectangle
 * @since 25.03.2021 - 21.50
 */
public class Rectangle implements Figure {


    private double recSide1;
    private double recSide2;

    public Rectangle(double recSide1, double recSide2) {
        this.recSide1 = recSide1;
        this.recSide2 = recSide2;
    }

    public Rectangle() {
    }

    public double getRecSide1() {
        return recSide1;
    }

    public void setRecSide1(double recSide1) {
        this.recSide1 = recSide1;
    }

    public double getRecSide2() {
        return recSide2;
    }

    public void setRecSide2(double recSide2) {
        this.recSide2 = recSide2;
    }

    @Override
    public String getNameOfFigure() {
        return "I am rectangle";
    }
}

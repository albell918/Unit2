import java.util.Objects;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Triangle
 * @since 17.03.2021 - 21.04
 */
public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.side1, side1) == 0 && Double.compare(triangle.side2, side2) == 0 && Double.compare(triangle.side3, side3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, side3);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';


    }

    public double getP() {

        return this.side1 + this.side2 + this.side3;
    }

    public double getHalfP() {

        return (this.side1 + this.side2 + this.side3) / 2;
    }

    public double getArea() {
        return Math.sqrt(this.getHalfP() * (this.getHalfP() - this.side1) *
                (this.getHalfP() - this.side2) * (this.getHalfP() - this.side3));
    }

    public double getBiggestSide(Triangle t) {

        double biggest = 0;

        if (t.getSide1() > t.getSide2()) {
            biggest = this.side1;
        } else biggest = this.side2;

        if (t.side3 > biggest) {
            biggest = this.side3;
        }

        return biggest;

    }

    public double getSmallestSide(Triangle t) {

        double smallest = 0;

        if (t.getSide1() < t.getSide2()) {
            smallest = this.side1;
        } else smallest = this.side2;

        if (t.side3 < smallest) {
            smallest = this.side3;
        }

        return smallest;

    }

    public static void main(String[] args) {

        Triangle tr1 = new Triangle(13, 12, 5);

        System.out.println(tr1.toString());
        System.out.println("Perimeter: " + tr1.getP());
        System.out.println("Semi-perimeter: " + tr1.getHalfP());
        System.out.println("Area: " + tr1.getArea());
        System.out.println("Smallest side :" + tr1.getSmallestSide(tr1));
        System.out.println("Biggest side: " + tr1.getBiggestSide(tr1));


    }
}

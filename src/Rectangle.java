import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Rectangle
 * @since 20.03.2021 - 16.12
 */
public class Rectangle implements IGeometry, IWritable {

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double countArea() {
        return this.getWidth() * this.getLength();
    }

    @Override
    public double countP() {
        return this.getLength() * 2 + this.getWidth() * 2;
    }

    @Override
    public void toTXT(Rectangle r) {

        try (FileWriter writer = new FileWriter("notes.txt", true)) {
            // запись всей строки
            String text = r.toString();
            writer.write(text);
            // запись по символам
            writer.append('\n');


        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        }
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 8);
        Rectangle r2 = new Rectangle(4, 5);
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.countArea());
        System.out.println("P: " + r1.countP());
        r1.toTXT(r1);
        r2.toTXT(r2);
    }

}
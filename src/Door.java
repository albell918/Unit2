/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Door
 * @since 20.03.2021 - 16.17
 */
public class Door extends Rectangle {

    private String colour;
    private String modelName;
    private double price;

    public Door() {
    }

    public Door(double length, double width, String colour, String modelName, double price) {
        super(length, width);
        this.colour = colour;
        this.modelName = modelName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Door{" + super.toString() +
                "colour='" + colour + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }

    public static String getTheMostExpensiveDoor(Door[] d) {

        double maxPrice = 0;

        String name = "";

        for (int i = 0; i < d.length; i++) {

            if (d[i].getPrice() > maxPrice) {
                maxPrice = d[i].price;

                name = d[i].getModelName();
            }

        }

        return name;

    }

    public static void main(String[] args) {

        Door d1 = new Door(190, 60, "brown", "Model c3e4", 2500.5);
        Door d2 = new Door(180, 60, "black", "Model g5e4", 1750);
        Door d3 = new Door(190, 80, "black", "Model h9e4", 3000);

        Door[] dormass = new Door[]{d1, d2, d3};

        System.out.println(getTheMostExpensiveDoor(dormass) + " is the most expensive model.");

        for (int i = 0; i < dormass.length; i++) {

            System.out.println(dormass[i].toString());
        }

    }


}
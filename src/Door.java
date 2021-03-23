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
    private String typeOfMaterial;


    public Door() {
    }

    public Door(double length, double width, String colour, String modelName, String typeOfMaterial) {
        super(length, width);
        this.colour = colour;
        this.modelName = modelName;
        this.typeOfMaterial = typeOfMaterial;
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
        return "Door{" +
                "colour='" + colour + '\'' +
                ", modelName='" + modelName + '\'' +
                ", typeOfMaterial='" + typeOfMaterial + '\'' +
                ", Price='" + this.calcPrice() + '\'' +
                '}';
    }

    public double calcPrice(){

        double price = 0.0;

        if (this.typeOfMaterial=="Wood"){

            price = 85*this.getLength()*this.getWidth()/10000;

        }
        else if (this.typeOfMaterial=="Iron"){

            price = 120*this.getLength()*this.getWidth()/10000;

        }

        else {

            price = 70*this.getLength()*this.getWidth()/10000;

        }

        return price;
    }

    public static String getTheMostExpensiveDoor(Door[] d) {

        double maxPrice = 0;

        String name = "";

        for (int i = 0; i < d.length; i++) {

            if (d[i].calcPrice() > maxPrice) {
                maxPrice = d[i].calcPrice();

                name = d[i].getModelName();
            }

        }

        return name;

    }

    public static void main(String[] args) {

        Door d1 = new Door(190, 60, "brown", "Model c3e4","Wood");
        Door d2 = new Door(180, 60, "black", "Model g5e4","Iron");
        Door d3 = new Door(190, 80, "black", "Model h9e4","Plastic");

        Door[] dormass = new Door[]{d1, d2, d3};

        System.out.println(getTheMostExpensiveDoor(dormass) + " is the most expensive model.");

        for (int i = 0; i < dormass.length; i++) {

            System.out.println(dormass[i].toString());
        }

    }

}

//        Model g5e4 is the most expensive model.
//        Door{colour='brown', modelName='Model c3e4', typeOfMaterial='Wood', Price='96.9'}
//        Door{colour='black', modelName='Model g5e4', typeOfMaterial='Iron', Price='129.6'}
//        Door{colour='black', modelName='Model h9e4', typeOfMaterial='Plastic', Price='106.4'}
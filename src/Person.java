/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class Person
 * @since 20.03.2021 - 16.54
 */
public class Person {

    private String name;
    private int age;
    private String gender;
    private double height;
    private double weight;
    private String citizenship;
    private String nationality;
    private boolean isStudying;
    private boolean isWorking;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, String gender, double height, double weight,
                  String citizenship, String nationality, boolean isStudying, boolean isWorking) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.citizenship = citizenship;
        this.nationality = nationality;
        this.isStudying = isStudying;
        this.isWorking = isWorking;
    }
}

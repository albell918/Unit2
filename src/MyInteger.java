/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit2
 * @class MyInteger
 * @since 27.03.2021 - 18.36
 */
public class MyInteger {

    private int number;

    public MyInteger() {
    }

    public MyInteger(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                return false;

            }


        }
      return true;
    }

    public static void main(String[] args) {
        MyInteger mi23 = new MyInteger(23);
        MyInteger mi25 = new MyInteger(25);
        MyInteger mi11 = new MyInteger(11);

        System.out.println("11 is prime - "+mi11.isPrime());
        System.out.println("23 is prime - "+mi23.isPrime());
        System.out.println("25 is prime - "+mi25.isPrime());
    }


}

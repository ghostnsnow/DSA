package recursion.problems;

public class Power {

    public static int pow(int number, int power) {

        if (power <= 1) {

            return number;
        } else {

            return number * pow(number, power - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(Power.pow(2, 5));
    }
}

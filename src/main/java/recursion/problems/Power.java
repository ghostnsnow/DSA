package recursion.problems;

/**
 * Write a function called power which accepts a base and an exponent. The function should return the power of the base to the exponent.
 * This function should mimic the functionality of math.pow() - do not worry about negative bases and exponents.
 *
 * Examples
 *
 * power(2,0) // 1
 * power(2,2) // 4
 * power(2,4) // 16
 */
public class Power {

    public static int pow(int base, int exponent) {

        if (exponent == 0) {

            return 1;
        } else {

            return base * pow(base, exponent - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(Power.pow(2, 5));//32
        System.out.println(Power.pow(2, 0));//1
        System.out.println(Power.pow(2, 1));//2
        System.out.println(Power.pow(2, 2));//4
    }
}

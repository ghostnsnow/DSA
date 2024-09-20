package recursion.problems;

/**
 * Write a function factorial which accepts a number and returns the factorial of that number.
 * A factorial is the product of an integer and all the integers below it; e.g., factorial four ( 4! ) is equal to 24, because 4 * 3 * 2 * 1 equals 24. factorial zero (0!) is always 1.
 *
 * Examples
 *
 * factorial(1) // 1
 * factorial(2) // 2
 * factorial(4) // 24
 * factorial(7) // 5040
 */
public class Factorial {

    public static int factorial(int num) {
        // TODO
        if (num == 0) {

            return 1;
        } else {

            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));
    }
}

package arrays.problems;

/**
 * Your task is to design an efficient algorithm to reverse a given integer. For example if the input of the algorithm is 1234 then the output should be 4321.
 *
 * NOTE: the input is an integer (and not a string) !!!
 */
public class IntegerReverse {

    public static int reverse(int n) {

        int remainder = n % 10;
        int divisor = n / 10;
        int sum = 0;

        while (divisor != 0) {

            sum = (sum * 10) + remainder;

            remainder = divisor % 10;
            divisor = divisor / 10;
        }

        sum = (sum * 10)  + remainder;

        return sum;
    }
}

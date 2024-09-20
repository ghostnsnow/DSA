package recursion.problems;

/**
 * Write a recursive function called fib which accepts a number and returns the nth number in the Fibonacci sequence.
 * Recall that the Fibonacci sequence is the sequence of whole numbers 0,1, 1, 2, 3, 5, 8, ... which starts with 0 and 1, and where every number thereafter is equal to the sum of the previous two numbers.
 *
 * Examples
 *
 * fib(4) # 3
 * fib(10) # 55
 * fib(28) # 317811
 * fib(35) # 9227465
 */
public class Fibonacci {

    public static int fib(int n) {
        // TODO
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n > 1) {
            return fib(n -1) + fib(n-2);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(fib(4));
        System.out.println(fib(10));
        System.out.println(fib(28));
        System.out.println(fib(35));
    }
}

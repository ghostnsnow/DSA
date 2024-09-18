package recursion.problems;

public class GCD {

    public static int getGCD(int num1, int num2) {

        if (num2 == 0) return num1;

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);

        return getGCD(min, max % min);
    }

    public static void main(String[] args) {

        System.out.println(GCD.getGCD(48, 18));
        System.out.println(GCD.getGCD(3, 2));
        System.out.println(GCD.getGCD(50, 5));
        System.out.println(GCD.getGCD(1000, 1000));
        System.out.println(GCD.getGCD(12, 18));
    }
}

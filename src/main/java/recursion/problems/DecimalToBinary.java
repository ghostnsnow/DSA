package recursion.problems;

public class DecimalToBinary {

    public static int convert(int num) {//10->1010

        if (num == 1) return 1;
        int remainder, quotient, sum = 0;

        remainder = num % 2;
        quotient = num / 2;

        return (convert(quotient) * 10) + remainder;
    }

    public static void main(String[] args) {

        System.out.println(DecimalToBinary.convert(10));
        System.out.println(DecimalToBinary.convert(11));
        System.out.println(DecimalToBinary.convert(3));
        System.out.println(DecimalToBinary.convert(580));

        double l = (1*Math.pow(26, 2)) + (1*Math.pow(26, 1)) + (3*Math.pow(26, 0));
        System.out.println(l);
    }
}

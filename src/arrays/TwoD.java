package arrays;

import java.util.Arrays;

public class TwoD {

    public static void main(String[] args) {

        int[][] ints = new int[2][2];

        System.out.println(Arrays.deepToString(ints)); // Output is : [[0, 0], [0, 0]] as 0 is he default integer value
        System.out.println(Arrays.toString(ints)); // Output is : [[I@65ab7765, [I@1b28cdfa]
    }
}

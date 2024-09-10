package arrays.problems;

import java.util.Arrays;

/**
 * Given 2D array calculate the sum of diagonal elements.
 *
 * Example
 *
 * myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
 *
 * sumDiagonalElements(myArray2D) # 15
 */
public class TwoD {

    public static void main(String[] args) {

        int[][] ints = new int[2][2];

        System.out.println(Arrays.deepToString(ints)); // Output is : [[0, 0], [0, 0]] as 0 is he default integer value
        System.out.println(Arrays.toString(ints)); // Output is : [[I@65ab7765, [I@1b28cdfa]
    }

    public int sumDiagonalElements(int[][] array) {

        //System.out.println(array.length);
        int length = array.length;
        int sum = 0;

        while(length > 0) {

            sum = sum + array[length - 1][length - 1];
            --length;
        }

        return sum;
    }
}

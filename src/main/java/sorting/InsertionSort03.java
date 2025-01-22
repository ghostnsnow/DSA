package sorting;

import java.util.Arrays;

public class InsertionSort03 {

    public static void sort(int[] arr) {

        System.out.println("Final Step : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        /** Output Would be :
         * Step : 0[0, 2, 67, 345, 345, 980, 45, 23]
         * Step : 1[0, 2, 67, 345, 345, 980, 45, 23]
         * Step : 2[0, 2, 23, 345, 345, 980, 45, 67]
         * Step : 3[0, 2, 23, 45, 345, 980, 345, 67]
         * Step : 4[0, 2, 23, 45, 67, 980, 345, 345]
         * Step : 5[0, 2, 23, 45, 67, 345, 980, 345]
         * Step : 6[0, 2, 23, 45, 67, 345, 345, 980]
         * Step : 7[0, 2, 23, 45, 67, 345, 345, 980]
         * Final Step : [0, 2, 23, 45, 67, 345, 345, 980]
         */
        sort(new int[]{45, 2, 67, 345, 345, 980, 0, 23});
    }
}

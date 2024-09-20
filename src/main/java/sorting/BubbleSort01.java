package sorting;

import java.util.Arrays;

public class BubbleSort01 {

    public static void sort(int[] arr) {

        int temp;

        for (int i = arr.length; i > 0; i--) {

            //int j = 0;
            for (int j = 0; j < i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.println("Step : " + i + Arrays.toString(arr));
        }

        System.out.println("Final Step : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        /** Output Would be :
         * Step : 8[2, 45, 67, 345, 345, 0, 23, 980]
         * Step : 7[2, 45, 67, 345, 0, 23, 345, 980]
         * Step : 6[2, 45, 67, 0, 23, 345, 345, 980]
         * Step : 5[2, 45, 0, 23, 67, 345, 345, 980]
         * Step : 4[2, 0, 23, 45, 67, 345, 345, 980]
         * Step : 3[0, 2, 23, 45, 67, 345, 345, 980]
         * Step : 2[0, 2, 23, 45, 67, 345, 345, 980]
         * Step : 1[0, 2, 23, 45, 67, 345, 345, 980]
         * Final Step : [0, 2, 23, 45, 67, 345, 345, 980]
         */
        sort(new int[]{45, 2, 67, 345, 345, 980, 0, 23});
    }
}

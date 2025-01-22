package arrays.problems;

import java.util.Arrays;

/**
 * Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * DO NOT allocate another 2D matrix and do the rotation.
 *
 * [1, 2, 3]            [7, 4, 1]
 * [4, 5, 6]    ==>     [8, 5, 2]
 * [7, 8, 9]            [9, 6, 3]
 */
public class RotateMatrix { //LeetCode48

    /**
     * No extra array, rotating in-place
     */
    public static boolean rotateMatrixInPlaceClockWise90Degrees(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i=first; i<last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }

        //System.out.println(Arrays.deepToString(matrix));
        return true;
    }


    public static void rotateMatrixInPlaceAntiClockwise90Degrees(int[][] arr, int n) {
        // Write your code here.

        int layer = n / 2, temp;
        int i = 0, j = n - 1;

        for (int k = 0; k < layer; k++) {

            int rowIndex = i, colIndex = i;

            for ( ; colIndex < j; colIndex++) {

                temp = arr[rowIndex][colIndex];
                arr[rowIndex][colIndex] = arr[colIndex][j];
                arr[colIndex][j] = arr[j][j - colIndex + rowIndex];
                arr[j][j - colIndex + rowIndex] = arr[j - colIndex + rowIndex][rowIndex];
                arr[j - colIndex + rowIndex][rowIndex] = temp;
            }

            ++i;
            --j;
        }

        printMatrix(arr);
    }

    public static void rotateMatrixInPlaceClockwise90Degrees(int[][] arr, int n) {

        int layer = n / 2, temp;
        int i = 0, j = n - 1;

        for (int k = 0; k < layer; k++) {

            int rowIndex = i, colIndex = i;

            for ( ; colIndex < j; colIndex++) {

                temp = arr[rowIndex][colIndex];
                arr[rowIndex][colIndex] = arr[j - colIndex + rowIndex][rowIndex];
                arr[j - colIndex + rowIndex][rowIndex] = arr[j][j - colIndex + rowIndex];
                arr[j][j - colIndex + rowIndex] = arr[colIndex][j];
                arr[colIndex][j] = temp;
            }

            ++i;
            --j;
        }

        printMatrix(arr);
    }

    public static void printMatrix(int[][] arr) {

        for (int[] child : arr) {
            System.out.println(Arrays.toString(child));
        }

        System.out.println("==========");
    }

    /**
     * My solution with using a different array
     */
    public static void rotateMatrix(int[][] matrix) {

        int i,j,k;
        int length = matrix.length;
        int[][] responseMatrix = new int[length][length];

        for (i = 0; i < length; i++) {

            j = length - 1 - i;

            for (k = 0; k < length; k++) {

                responseMatrix[k][j] = matrix[i][k];
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(responseMatrix));
    }

    public static int[][] createMatrix(int n) {

        int[][] matrix = new int[n][n];
        int data = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matrix[i][j] = data++;
            }
        }

        printMatrix(matrix);
        return matrix;
    }
    public static void main(String[] args) {

        //int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//new int[3][3];

        /*int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printMatrix(matrix);
        System.out.println("==========");
        rotateMatrixInPlaceAntiClockwise90Degrees(matrix, matrix.length);*/

        int[][] matrix9ACW = createMatrix(9);
        int[][] matrix9CW = createMatrix(9);
        rotateMatrixInPlaceAntiClockwise90Degrees(matrix9ACW, matrix9ACW.length);
        rotateMatrixInPlaceClockwise90Degrees(matrix9CW, matrix9CW.length);
    }
}

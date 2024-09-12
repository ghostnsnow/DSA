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
    public boolean rotateMatrixInPlace(int[][] matrix) {
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

        return true;
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

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//new int[3][3];
        rotateMatrix(matrix);
    }
}

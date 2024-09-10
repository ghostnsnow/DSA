package arrays.problems;

/**
 * Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
 *
 * Example
 *
 * myArray = {1,2,3,4,6}
 * findMissingNumberInArray(myArray, 6) // 5
 */
public class MissingNumber {

    public int findMissingNumberInArray(int[] arr) {

        int sum = 0;
        int max = arr[arr.length - 1];
        int factorial = (max * (max+1))/2;
        for (int i : arr) {

            sum = sum + i;
        }

        return factorial - sum;
    }
}

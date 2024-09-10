package arrays.problems;

/**
 * Given an array, write a function to get first, second best scores from the array and return it in new array.
 *
 * Array may contain duplicates.
 *
 * Example
 *
 * myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
 * firstSecond(myArray) // {90, 87}
 */
public class BestScore {

    public int[] findTopTwoScores(int[] array) {

        int[] output = new int[2];
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int index = 0; index < array.length; index++) {

            if (array[index] > first) {

                second = first;
                first = array[index];
            } else if (array[index] > second) {

                second = array[index];
            }
        }

        output[0] = first;
        output[1] = second;

        return output;
    }

}

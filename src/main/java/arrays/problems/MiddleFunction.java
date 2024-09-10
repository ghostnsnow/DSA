package arrays.problems;
/**
 Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

 myArray = [1, 2, 3, 4]
 middle(myArray)  # [2,3].
 */
public class MiddleFunction {

    public int[] middle(int[] arr) {

        if (arr.length <= 2)
            throw new ArrayIndexOutOfBoundsException("Length less than or equal to 2");
        else {

            int[] ret = new int[arr.length - 2];

            for (int index = 1; index < arr.length - 1; index++) {

                ret[index - 1] = arr[index];
            }

            return ret;
        }
    }
}



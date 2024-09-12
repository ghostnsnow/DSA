package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {

    @Test
    void permutation() {

        int arr1[] = {2, 1, 3, 5, 4, 3, 2};
        int arr2[] = {3, 2, 2, 4, 5, 3, 1};

        Assertions.assertTrue(Permutation.permutation(arr1, arr2));

        int arr3[] = {2, 1, 3, 5};
        int arr4[] = {3, 2, 2, 4};

        Assertions.assertFalse(Permutation.permutation(arr3, arr4));
    }
}
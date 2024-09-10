package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateNumberTest {

    @Test
    void removeDuplicates() {

        int[] input = {1, 1, 2, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        Assertions.assertArrayEquals(expected, DuplicateNumber.removeDuplicates(input));
    }
}
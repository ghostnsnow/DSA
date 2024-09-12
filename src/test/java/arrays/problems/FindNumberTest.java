package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumberTest {

    @Test
    void searchInArray() {

        int[] input = {1,2,3,4,5,6};
        int expected = 5;
        int actual = FindNumber.searchInArray(input, 6);

        Assertions.assertEquals(expected, actual);
    }
}
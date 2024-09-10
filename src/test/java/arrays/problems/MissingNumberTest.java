package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    MissingNumber missingNumber;

    @BeforeEach
    public void setUp() {

        missingNumber = new MissingNumber();
    }

    @Test
    void findMissingNumberInArray() {

        int expected = 5;
        int[] arr = {1,2,3,4,6};
        int actual = missingNumber.findMissingNumberInArray(arr);

        Assertions.assertEquals(expected, actual);
    }
}
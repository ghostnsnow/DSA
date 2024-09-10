package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoDTest {

    TwoD twoD;

    @BeforeEach
    void setup() {

        twoD = new TwoD();
    }

    @Test
    void sumDiagonalElements() {

        int expected = 15;
        int[][] inputArray = {{1,2,3},{4,5,6},{7,8,9}};
        int actual = twoD.sumDiagonalElements(inputArray);

        Assertions.assertEquals(expected, actual);
    }
}
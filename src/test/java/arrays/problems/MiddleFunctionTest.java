package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleFunctionTest {

    MiddleFunction middleFunction;

    @BeforeEach
    void setup() {

        middleFunction = new MiddleFunction();
    }

    @Test
    void middleLength2() {

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> middleFunction.middle(new int[1]));
    }

    @Test
    void middleLength6() {

        int[] arr = middleFunction.middle(new int[]{3, 5, 7, 9, 6, 8});
        Assertions.assertArrayEquals(new int[]{5, 7, 9, 6}, arr);
        //Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> middleFunction.middle(new int[1]));
    }
}
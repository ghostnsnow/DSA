package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerReverseTest {

    @Test
    void reverse() {

        int expected = 4321;
        int actual = IntegerReverse.reverse(1234);

        Assertions.assertEquals(expected, actual);

        expected = 4;
        actual = IntegerReverse.reverse(4);

        Assertions.assertEquals(expected, actual);

        expected = 1;
        actual = IntegerReverse.reverse(1);

        Assertions.assertEquals(expected, actual);

        expected = 0;
        actual = IntegerReverse.reverse(0);

        Assertions.assertEquals(expected, actual);

        expected = 43;
        actual = IntegerReverse.reverse(34);

        Assertions.assertEquals(expected, actual);

        expected = 111111;
        actual = IntegerReverse.reverse(111111);

        Assertions.assertEquals(expected, actual);
    }
}
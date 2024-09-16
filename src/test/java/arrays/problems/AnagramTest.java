package arrays.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void solve() {

        char[] input1 = {'r', 'e', 's', 't', 'f', 'u', 'l'};
        char[] input2 = {'f', 'l', 'u', 's', 't', 'e', 'r'};

        Assertions.assertTrue(Anagram.solve(input1, input2));

        char[] input3 = {'c', 'a', 't'};
        char[] input4 = {'b', 'a', 't'};

        Assertions.assertFalse(Anagram.solve(input3, input4));

        char[] input5 = {'r', 'o', 't', 'a', 't', 'e', 's'};
        char[] input6 = {'t', 'o', 'a', 's', 't', 'e', 'r'};

        Assertions.assertTrue(Anagram.solve(input5, input6));
    }
}
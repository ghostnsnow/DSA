package strings.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode125Test {

    @Test
    public void testPalindrome() {

        Assertions.assertFalse(LeetCode125.checkPalindrome("123@# 455sdfdf **(     GHJJK"));
        Assertions.assertTrue(LeetCode125.checkPalindrome("A man, a plan, a canal: Panama"));
        Assertions.assertFalse(LeetCode125.checkPalindrome("race a car"));
        Assertions.assertTrue(LeetCode125.checkPalindrome(" "));
    }
}
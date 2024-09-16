package arrays.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Your task is to construct an algorithm to check whether two words (or phrases) are anagrams or not!
 * "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once"
 *
 * For example: restful and fluster are anagrams.
 *
 */
public class Anagram {

    public static boolean solve(char[] array1, char[] array2) {

        Map<Character, Integer> map = new HashMap<>();
        boolean isPerm = true;

        for (char val : array1) {

            if (map.containsKey(val)) {

                map.put(val, map.get(val) + 1);
            } else {

                map.put(val, 1);
            }
        }

        System.out.println(map);

        for (char val : array2) {

            if (map.containsKey(val)) {

                if (map.get(val) == 1) {

                    map.remove(val);
                } else {

                    map.put(val, (map.get(val) - 1));
                }
            } else {

                return false;
            }
        }

        System.out.println(map);

        if (map.size() > 0) isPerm = false;

        return isPerm;
    }
}

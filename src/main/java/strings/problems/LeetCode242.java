package strings.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class LeetCode242 {

    public static boolean isAnagram(String s1, String s2) {

        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;

        String[] array1 = s1.split("");
        String[] array2 = s2.split("");

        Map<String, Integer> map = new HashMap<>();
        boolean isPerm = true;

        for (String val : array1) {

            if (map.containsKey(val)) {

                map.put(val, map.get(val) + 1);
            } else {

                map.put(val, 1);
            }
        }

        //System.out.println(map);

        for (String val : array2) {

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

        //System.out.println(map);

        if (map.size() > 0) isPerm = false;

        return isPerm;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("restful", "fluster"));
        System.out.println(isAnagram("cat", "bat"));
        System.out.println(isAnagram("rotates", "toaster"));
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 205: Isomorphic Strings
 * https://leetcode.com/problems/isomorphic-strings/
 *
 * Time: O(n)
 * Space: O(k)
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapFromS = new HashMap<>();
        Map<Character, Character> mapFromT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char fromS = s.charAt(i);
            char fromT = t.charAt(i);

            if (mapFromS.containsKey(fromS) && mapFromS.get(fromS) != fromT) {
                return false;
            }

            if (mapFromT.containsKey(fromT) && mapFromT.get(fromT) != fromS) {
                return false;
            }

            mapFromS.put(fromS, fromT);
            mapFromT.put(fromT, fromS);
        }

        return true;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * LeetCode 49: Group Anagrams
 * https://leetcode.com/problems/group-anagrams/
 *
 * Time: O(n * k), where k is the maximum string length
 * Space: O(n * k)
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> groups = new HashMap<>();
        int[] count = new int[26];

        for (String s : strs) {
            Arrays.fill(count, 0);

            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for (int frequency : count) {
                keyBuilder.append('#').append(frequency);
            }

            String key = keyBuilder.toString();
            groups.computeIfAbsent(key, ignored -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }
}

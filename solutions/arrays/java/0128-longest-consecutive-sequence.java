import java.util.HashSet;
import java.util.Set;

// Problem: https://leetcode.com/problems/longest-consecutive-sequence/
// Time: O(n) average
// Space: O(n)

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

        int longest = 1;

        for (int num : numbers) {
            if (numbers.contains(num - 1)) {
                continue;
            }

            int current = num;
            int length = 1;

            while (numbers.contains(current + 1)) {
                current++;
                length++;
            }

            longest = Math.max(longest, length);
        }

        return longest;
    }
}

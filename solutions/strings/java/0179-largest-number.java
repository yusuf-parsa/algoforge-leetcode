import java.util.Arrays;
import java.util.Comparator;

/**
 * LeetCode 179: Largest Number
 * https://leetcode.com/problems/largest-number/
 *
 * Time: O(n log n * k)
 * Space: O(n * k)
 */
class Solution {
    public String largestNumber(int[] nums) {
        String[] values = new String[nums.length];

        for (int index = 0; index < nums.length; index++) {
            values[index] = Integer.toString(nums[index]);
        }

        Arrays.sort(values, new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return (second + first).compareTo(first + second);
            }
        });

        if (values[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();

        for (String value : values) {
            answer.append(value);
        }

        return answer.toString();
    }
}

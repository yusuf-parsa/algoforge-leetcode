import java.util.TreeSet;

// Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time: O(n log n)
// Space: O(n)

class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> uniqueNumbers = new TreeSet<>();

        for (int num : nums) {
            uniqueNumbers.add(num);
        }

        int index = 0;
        for (int num : uniqueNumbers) {
            nums[index++] = num;
        }

        return uniqueNumbers.size();
    }
}

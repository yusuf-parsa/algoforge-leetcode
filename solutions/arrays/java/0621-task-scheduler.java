import java.util.Arrays;

/**
 * LeetCode 621: Task Scheduler
 * https://leetcode.com/problems/task-scheduler/
 *
 * Time: O(t), where t is the number of tasks
 * Space: O(1)
 */
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequency = new int[26];

        for (char task : tasks) {
            frequency[task - 'A']++;
        }

        Arrays.sort(frequency);
        int maximumFrequency = frequency[25];
        int idleSlots = (maximumFrequency - 1) * n;

        for (int index = 24; index >= 0; index--) {
            idleSlots -= Math.min(
                maximumFrequency - 1,
                frequency[index]
            );
        }

        idleSlots = Math.max(0, idleSlots);
        return tasks.length + idleSlots;
    }
}

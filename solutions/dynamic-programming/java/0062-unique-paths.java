/**
 * LeetCode 62: Unique Paths
 * https://leetcode.com/problems/unique-paths/
 *
 * Time: O(m * n)
 * Space: O(m * n)
 */
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];

        for (int column = 0; column < n; column++) {
            paths[0][column] = 1;
        }

        for (int row = 0; row < m; row++) {
            paths[row][0] = 1;
        }

        for (int row = 1; row < m; row++) {
            for (int column = 1; column < n; column++) {
                paths[row][column] =
                    paths[row - 1][column] + paths[row][column - 1];
            }
        }

        return paths[m - 1][n - 1];
    }
}

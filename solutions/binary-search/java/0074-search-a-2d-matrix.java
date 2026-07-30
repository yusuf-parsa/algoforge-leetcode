/**
 * LeetCode 74: Search a 2D Matrix
 * https://leetcode.com/problems/search-a-2d-matrix/
 *
 * Time: O(m + n)
 * Space: O(1)
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            int current = matrix[row][column];

            if (current == target) {
                return true;
            }

            if (target < current) {
                column--;
            } else {
                row++;
            }
        }

        return false;
    }
}

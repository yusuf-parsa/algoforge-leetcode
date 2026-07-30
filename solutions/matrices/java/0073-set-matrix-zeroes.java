/**
 * LeetCode 73: Set Matrix Zeroes
 * https://leetcode.com/problems/set-matrix-zeroes/
 *
 * Time: O(m * n)
 * Space: O(m + n)
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroColumns = new boolean[columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (matrix[row][column] == 0) {
                    zeroRows[row] = true;
                    zeroColumns[column] = true;
                }
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (zeroRows[row] || zeroColumns[column]) {
                    matrix[row][column] = 0;
                }
            }
        }
    }
}

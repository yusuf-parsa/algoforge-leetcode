/**
 * LeetCode 59: Spiral Matrix II
 * https://leetcode.com/problems/spiral-matrix-ii/
 *
 * Time: O(n^2)
 * Space: O(1) extra
 */
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int startRow = 0;
        int startColumn = 0;
        int endRow = n - 1;
        int endColumn = n - 1;
        int number = 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int column = startColumn; column <= endColumn; column++) {
                matrix[startRow][column] = number++;
            }

            for (int row = startRow + 1; row <= endRow; row++) {
                matrix[row][endColumn] = number++;
            }

            if (startRow < endRow) {
                for (int column = endColumn - 1; column >= startColumn; column--) {
                    matrix[endRow][column] = number++;
                }
            }

            if (startColumn < endColumn) {
                for (int row = endRow - 1; row > startRow; row--) {
                    matrix[row][startColumn] = number++;
                }
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }

        return matrix;
    }
}

/**
 * LeetCode 566: Reshape the Matrix
 * https://leetcode.com/problems/reshape-the-matrix/
 *
 * Time: O(m * n)
 * Space: O(m * n)
 */
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;

        if (rows * columns != r * c) {
            return mat;
        }

        int[][] reshaped = new int[r][c];
        int[] elements = new int[rows * columns];
        int elementIndex = 0;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                elements[elementIndex++] = mat[row][column];
            }
        }

        elementIndex = 0;
        for (int row = 0; row < r; row++) {
            for (int column = 0; column < c; column++) {
                reshaped[row][column] = elements[elementIndex++];
            }
        }

        return reshaped;
    }
}

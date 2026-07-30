/**
 * LeetCode 1572: Matrix Diagonal Sum
 * https://leetcode.com/problems/matrix-diagonal-sum/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        int sum = 0;

        for (int index = 0; index < size; index++) {
            sum += mat[index][index];
            sum += mat[index][size - 1 - index];
        }

        if (size % 2 == 1) {
            sum -= mat[size / 2][size / 2];
        }

        return sum;
    }
}

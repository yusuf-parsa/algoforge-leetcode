import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 36: Valid Sudoku
 * https://leetcode.com/problems/valid-sudoku/
 *
 * Time: O(1) for the fixed 9 x 9 board
 * Space: O(1)
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];

                if (value == '.') {
                    continue;
                }

                if (!seen.add(value + " at row " + row)
                        || !seen.add(value + " at col " + col)
                        || !seen.add(value + " at box " + row / 3 + "-" + col / 3)) {
                    return false;
                }
            }
        }

        return true;
    }
}

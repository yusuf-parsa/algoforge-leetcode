/**
 * LeetCode 79: Word Search
 * https://leetcode.com/problems/word-search/
 *
 * Time: O(m * n * 4^L), where L is the word length
 * Space: O(L)
 */
class Solution {
    private char[][] board;
    private int rows;
    private int columns;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        rows = board.length;
        columns = board[0].length;

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (backtrack(row, column, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean backtrack(
            int row,
            int column,
            String word,
            int index) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0
                || row >= rows
                || column < 0
                || column >= columns
                || board[row][column] != word.charAt(index)) {
            return false;
        }

        int[] rowDirection = {0, 1, 0, -1};
        int[] columnDirection = {1, 0, -1, 0};
        board[row][column] = '#';
        boolean found = false;

        for (int direction = 0; direction < 4; direction++) {
            found = backtrack(
                row + rowDirection[direction],
                column + columnDirection[direction],
                word,
                index + 1
            );

            if (found) {
                break;
            }
        }

        board[row][column] = word.charAt(index);
        return found;
    }
}

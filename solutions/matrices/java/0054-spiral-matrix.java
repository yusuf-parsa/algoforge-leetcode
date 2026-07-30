import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 54: Spiral Matrix
 * https://leetcode.com/problems/spiral-matrix/
 *
 * Time: O(m * n)
 * Space: O(1) extra
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<>();
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int column = startColumn; column <= endColumn; column++) {
                order.add(matrix[startRow][column]);
            }

            for (int row = startRow + 1; row <= endRow; row++) {
                order.add(matrix[row][endColumn]);
            }

            for (int column = endColumn - 1; column >= startColumn; column--) {
                if (startRow == endRow) {
                    break;
                }
                order.add(matrix[endRow][column]);
            }

            for (int row = endRow - 1; row >= startRow + 1; row--) {
                if (startColumn == endColumn) {
                    break;
                }
                order.add(matrix[row][startColumn]);
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }

        return order;
    }
}

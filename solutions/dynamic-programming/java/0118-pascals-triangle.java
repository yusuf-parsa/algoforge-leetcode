import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode 118: Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/
 *
 * Time: O(numRows^2)
 * Space: O(numRows) extra
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new LinkedList<>();

        if (numRows < 1) {
            return triangle;
        }

        List<Integer> previous = new ArrayList<>();
        previous.add(1);
        triangle.add(previous);

        for (int row = 1; row < numRows; row++) {
            List<Integer> current = new LinkedList<>();
            current.add(1);

            for (int column = 1; column < row; column++) {
                current.add(previous.get(column) + previous.get(column - 1));
            }

            current.add(1);
            triangle.add(current);
            previous = current;
        }

        return triangle;
    }
}

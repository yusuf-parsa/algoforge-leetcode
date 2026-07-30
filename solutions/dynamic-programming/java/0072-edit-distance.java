/**
 * LeetCode 72: Edit Distance
 * https://leetcode.com/problems/edit-distance/
 *
 * Time: O(m * n)
 * Space: O(m * n)
 */
class Solution {
    public int minDistance(String word1, String word2) {
        int rows = word1.length();
        int columns = word2.length();
        int[][] distance = new int[rows + 1][columns + 1];

        for (int row = 0; row <= rows; row++) {
            distance[row][0] = row;
        }

        for (int column = 0; column <= columns; column++) {
            distance[0][column] = column;
        }

        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= columns; column++) {
                if (word1.charAt(row - 1) == word2.charAt(column - 1)) {
                    distance[row][column] = distance[row - 1][column - 1];
                } else {
                    int delete = distance[row - 1][column];
                    int insert = distance[row][column - 1];
                    int replace = distance[row - 1][column - 1];

                    distance[row][column] =
                        1 + Math.min(delete, Math.min(insert, replace));
                }
            }
        }

        return distance[rows][columns];
    }
}

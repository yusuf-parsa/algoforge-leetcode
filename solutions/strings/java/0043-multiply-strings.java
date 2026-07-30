/**
 * LeetCode 43: Multiply Strings
 * https://leetcode.com/problems/multiply-strings/
 *
 * Time: O(n * m)
 * Space: O(n + m)
 */
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int length1 = num1.length();
        int length2 = num2.length();
        int[] result = new int[length1 + length2];

        for (int i = length1 - 1; i >= 0; i--) {
            for (int j = length2 - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;

                int currentPosition = i + j + 1;
                int carryPosition = i + j;
                int total = product + result[currentPosition];

                result[currentPosition] = total % 10;
                result[carryPosition] += total / 10;
            }
        }

        StringBuilder answer = new StringBuilder();

        for (int digit : result) {
            if (answer.length() == 0 && digit == 0) {
                continue;
            }

            answer.append(digit);
        }

        return answer.toString();
    }
}

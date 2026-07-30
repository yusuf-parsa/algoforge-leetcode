/**
 * LeetCode 151: Reverse Words in a String
 * https://leetcode.com/problems/reverse-words-in-a-string/
 *
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public String reverseWords(String s) {
        String trimmed = s.trim();

        if (trimmed.length() == 0) {
            return "";
        }

        StringBuilder currentWord = new StringBuilder();
        StringBuilder answer = new StringBuilder();

        for (int index = trimmed.length() - 1; index >= 0; index--) {
            char character = trimmed.charAt(index);

            if (character != ' ') {
                currentWord.append(character);
                continue;
            }

            appendWord(answer, currentWord);
        }

        appendWord(answer, currentWord);
        return answer.toString();
    }

    private void appendWord(
            StringBuilder answer,
            StringBuilder reversedWord) {
        if (reversedWord.length() == 0) {
            return;
        }

        if (answer.length() > 0) {
            answer.append(' ');
        }

        for (int index = reversedWord.length() - 1; index >= 0; index--) {
            answer.append(reversedWord.charAt(index));
        }

        reversedWord.setLength(0);
    }
}

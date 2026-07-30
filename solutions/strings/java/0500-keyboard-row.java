import java.util.ArrayList;
import java.util.List;

// Problem: https://leetcode.com/problems/keyboard-row/
// Time: O(c), where c is the total number of characters
// Space: O(w), for the output list

class Solution {
    public String[] findWords(String[] words) {
        List<String> validWords = new ArrayList<>();
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        for (String originalWord : words) {
            String word = originalWord.toLowerCase();
            String row;

            if (firstRow.indexOf(word.charAt(0)) != -1) {
                row = firstRow;
            } else if (secondRow.indexOf(word.charAt(0)) != -1) {
                row = secondRow;
            } else {
                row = thirdRow;
            }

            boolean isValid = true;

            for (int i = 1; i < word.length(); i++) {
                if (row.indexOf(word.charAt(i)) == -1) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                validWords.add(originalWord);
            }
        }

        return validWords.toArray(new String[0]);
    }
}

import java.util.HashMap;
import java.util.Map;

// Problem: https://leetcode.com/problems/verifying-an-alien-dictionary/
// Time: O(c), where c is the total number of compared characters
// Space: O(1), because the alphabet has 26 letters

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> positions = new HashMap<>();

        for (int i = 0; i < order.length(); i++) {
            positions.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            String currentWord = words[i];
            String nextWord = words[i + 1];

            for (int j = 0; j < currentWord.length(); j++) {
                if (j >= nextWord.length()) {
                    return false;
                }

                char currentLetter = currentWord.charAt(j);
                char nextLetter = nextWord.charAt(j);

                if (currentLetter != nextLetter) {
                    if (positions.get(nextLetter) < positions.get(currentLetter)) {
                        return false;
                    }
                    break;
                }
            }
        }

        return true;
    }
}

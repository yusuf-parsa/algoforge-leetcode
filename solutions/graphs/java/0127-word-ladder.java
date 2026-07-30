import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * LeetCode 127: Word Ladder
 * https://leetcode.com/problems/word-ladder/
 *
 * Time: O(N * L^2)
 * Space: O(N * L^2)
 */
class Solution {
    public int ladderLength(
            String beginWord,
            String endWord,
            List<String> wordList) {
        int wordLength = beginWord.length();
        Map<String, List<String>> patternToWords = new HashMap<>();

        for (String word : wordList) {
            for (int index = 0; index < wordLength; index++) {
                String pattern =
                    word.substring(0, index)
                    + '*'
                    + word.substring(index + 1);

                patternToWords
                    .computeIfAbsent(pattern, key -> new ArrayList<>())
                    .add(word);
            }
        }

        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> level = new HashMap<>();
        queue.offer(beginWord);
        level.put(beginWord, 1);

        while (!queue.isEmpty()) {
            String word = queue.poll();
            int currentLevel = level.get(word);

            for (int index = 0; index < wordLength; index++) {
                String pattern =
                    word.substring(0, index)
                    + '*'
                    + word.substring(index + 1);

                for (String adjacentWord :
                        patternToWords.getOrDefault(
                            pattern,
                            Collections.emptyList()
                        )) {
                    if (adjacentWord.equals(endWord)) {
                        return currentLevel + 1;
                    }

                    if (!level.containsKey(adjacentWord)) {
                        level.put(adjacentWord, currentLevel + 1);
                        queue.offer(adjacentWord);
                    }
                }
            }
        }

        return 0;
    }
}

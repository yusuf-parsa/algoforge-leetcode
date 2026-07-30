import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 705: Design HashSet
 * https://leetcode.com/problems/design-hashset/
 *
 * Add/Remove/Contains: O(n)
 * Space: O(n)
 */
class MyHashSet {
    private final List<Integer> values;

    public MyHashSet() {
        values = new ArrayList<>();
    }

    public void add(int key) {
        if (!values.contains(key)) {
            values.add(key);
        }
    }

    public void remove(int key) {
        values.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return values.contains(key);
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 706: Design HashMap
 * https://leetcode.com/problems/design-hashmap/
 *
 * Put/Get/Remove: O(n)
 * Space: O(n)
 */
class MyHashMap {
    private final List<Integer> keys;
    private final List<Integer> values;

    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(int key, int value) {
        int index = keys.indexOf(key);

        if (index == -1) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(index, value);
        }
    }

    public int get(int key) {
        int index = keys.indexOf(key);
        return index == -1 ? -1 : values.get(index);
    }

    public void remove(int key) {
        int index = keys.indexOf(key);

        if (index != -1) {
            keys.remove(index);
            values.remove(index);
        }
    }
}

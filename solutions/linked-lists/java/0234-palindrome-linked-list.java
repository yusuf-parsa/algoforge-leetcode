import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly linked list:
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *
 * LeetCode 234: Palindrome Linked List
 * https://leetcode.com/problems/palindrome-linked-list/
 *
 * Time: O(n)
 * Space: O(n)
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        for (int i = 0; i < values.size() / 2; i++) {
            if (!values.get(i).equals(values.get(values.size() - 1 - i))) {
                return false;
            }
        }

        return true;
    }
}

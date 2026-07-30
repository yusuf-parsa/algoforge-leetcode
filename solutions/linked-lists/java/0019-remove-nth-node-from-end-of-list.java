/**
 * Definition for singly linked list:
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 *
 * LeetCode 19: Remove Nth Node From End of List
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        int size = 0;

        while (current != null) {
            current = current.next;
            size++;
        }

        if (size == n) {
            return head.next;
        }

        ListNode previous = head;

        for (int i = 0; i < size - n - 1; i++) {
            previous = previous.next;
        }

        previous.next = previous.next.next;
        return head;
    }
}
